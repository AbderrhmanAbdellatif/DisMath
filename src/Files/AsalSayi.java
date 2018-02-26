package Matrix;

import java.util.Scanner;

public class AsalSayi {
	public static void main(String[] args)
    {
		final int total =20;
		final int displayPerLine = 10;
		int count = 1;
		int number = 2;
		
		while (count <= total)
		{
			  if (Asal(number) && isPalindrome(number))
			  {
			     System.out.print(number + " ");
			     if (count % displayPerLine == 0)
				 System.out.println();
			     count++;
			  }   
			  number++;
		}
	}
    
    public static boolean Asal(int num)
    {
    	if (num == 2)
    	   return true;
    	for (int divisor = 2; divisor <= num/2; divisor++)
    	{
    		if (num % divisor == 0)
    		   return false;
    	}
    	return true;
    }

    public static int TersYazdirme(int num)
    {
    	int test = 0;
    	while (num != 0)
    	{
    		  int lastdigit = num % 10;
    		  test = test * 10 + lastdigit;
    		  num = num / 10;
    	}
    	return test;
    }
    
    public static boolean isPalindrome(int num)
    {
    	return num == TersYazdirme(num);
    }

	 
}
