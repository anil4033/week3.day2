package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetOnlyUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * (Set) Print only unique characters in the given string 
		 * String companyName = "google" --> "gole" 
            Hints: Use Set with add method.
		 */
		String companyName = "google";
		
		char[] chars= companyName.toCharArray();
		
		Set<Character> unique = new LinkedHashSet<Character>();
		
		for (int i = 0; i < chars.length; i++) {
			unique.add(chars[i]);			
			
		}
		System.out.println(unique);
						
		for(Character character : unique) 
			
		{ 
			System.out.print(character); 
		}
			
	}

}
