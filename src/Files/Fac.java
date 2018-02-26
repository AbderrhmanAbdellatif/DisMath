package Matrix;

import java.util.Scanner;

public class Fac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num;
	    long fact=1;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    num = input.nextLong();
	    for (int i=2;i<=num; i++){
	        fact=fact*i;
	    }

	    System.out.println("Factorial: "+fact);
	}

}
