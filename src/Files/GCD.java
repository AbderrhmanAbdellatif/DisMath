package Matrix;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        System.out.println("a giriniz");
	        int a = scanner.nextInt();
	        System.out.println("b giriniz ");
	        int b = scanner.nextInt();
	       int i= gcd(a, b);
	       System.out.println(i);
	      	}
	static int gcd(int a, int b)
	{
	  while(a!=0 && b!=0) // until either one of them is 0
	  {
	     int c = b;
	     b = a%b;
	     a = c;
	  }
	  return a+b; // either one is 0, so return the non-zero value
	}
}
