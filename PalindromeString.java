package practice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		String orgStr= str;
		String rev="";
		int length=str.length();
		
		for(int i=length-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(orgStr.equals(rev))
		{
			System.out.println(orgStr+" is a palindrome string");
		}
		else
		{
			System.out.println(orgStr+" is not a palindrome string");
		}

	}

}
