package practice;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string: ");
		String s1=sc.nextLine();
		System.out.println("Enter second string: ");
		String s2=sc.nextLine();
		CheckAnagram ca=new CheckAnagram();
		ca.check(s1, s2);

	}
	
	void check(String s1, String s2) {
		 char ch1[]=s1.toCharArray();
		 char ch2[]=s2.toCharArray();
		 
		 boolean flag=true;
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 
		 if(ch1.length!=ch2.length)
		 {
			 flag=false;
		 }
		 
		 for(int i=0; i<ch1.length;i++)
		 {
			 if(ch1[i]!=ch2[i])
			 {
				 flag=false;
			 }
		 }
		 
		 if(flag==true)
		 {
			 System.out.println("String is Anagram");
		 }
		 else
			{
				System.out.println("String is not Anagram");
			}
	}

}
