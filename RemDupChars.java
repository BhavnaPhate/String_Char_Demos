package practice;

import java.util.Scanner;

public class RemDupChars {
	
	String remDuplicateChar(String s1)
	{
		String s2="";
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)==' ')
			{
				s2=s2+s1.charAt(i);	
			}
			else if (!s2.contains(String.valueOf(s1.charAt(i))))
			{
				s2=s2+s1.charAt(i);
			}
		}
		return s2;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1=sc.nextLine();
		RemDupChars obj=new RemDupChars();
		String s2=obj.remDuplicateChar(s1);
		System.out.println("After removing duplicate characters: \n"+s2);

	}

}
