package practice;

import java.util.Scanner;

public class CountWords1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		
		str=str.trim();
		String nw[]=str.split(" ");
		System.out.println(nw.length);

	}

}
