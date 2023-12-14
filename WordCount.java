package practice;

public class WordCount {

	public static void main(String[] args) {
		
		String s1= "Welcome to my new website";
		int count=1;
		
		char ch[]= new char[s1.length()];
		
		for(int i=0; i<s1.length(); i++)
		{
			ch[i]=s1.charAt(i);
		}
		for(char c:ch)
		{
			if(c==' ')
			{
				count++;
			}
		}
		System.out.println("Word count is: "+count);
	}

}
