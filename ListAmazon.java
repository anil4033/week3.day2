package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListAmazon {

	public static void main(String[] args) {
		
		/*Classroom Assignment 1: (List) 
         1) Go to https://amazon.in 
         2) Type phones 
         3) Print price of every phone 
         4) Print the lowest price ! */
		
		       //to call WDM for driver
				WebDriverManager.chromedriver().setup();
				
				//Launch Browser
				ChromeDriver driver = new ChromeDriver();
				
				//Load URL
				driver.get("https://amazon.in");
				
				//Maximize the Browser
				driver.manage().window().maximize();
				
				//Add implicitwait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Type phones
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones",Keys.ENTER);
				
				//Reading all Prices in to List
				List<WebElement> phones = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
				
				List<Integer> phoneprices = new ArrayList<Integer>();
				
				for(int i=0;i<phones.size();i++)
				{
					System.out.println(phones.get(i).getText());
					String pricestr = phones.get(i).getText().replace(",", "");
					
					//converting String to Integer
					int price = Integer.parseInt(pricestr);
					phoneprices.add(price);
					
				}
				Collections.sort(phoneprices);
				System.out.println(phoneprices.get(0));
	}

}
