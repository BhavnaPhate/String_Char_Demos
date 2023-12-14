package practice;

import java.util.Scanner;

public class VowelConsonant {
	
	void counter(String s1) 
	{
		int vowCounter=0;
		int conCounter=0;
		
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)==' ') 
			{
				continue;
			}
			else
			{
				if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||
				s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')
				{
					vowCounter++;
				}
				else
				{
					conCounter++;
				}
			}
		}
		System.out.println("Vowels: "+vowCounter );
		System.out.println("Consonents: "+conCounter);
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the characters: ");
		String s1=sc.nextLine();
		VowelConsonant vc=new VowelConsonant();
		vc.counter(s1);	
	}

}
