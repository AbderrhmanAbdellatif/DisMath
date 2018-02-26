package Matrix;

import java.util.Scanner;

public class FacR {
	 public static void main(String args[]) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        System.out.print(factorial(n));
	    }

	    private static int factorial(int n) {      // HERE I DON'T UNDERSTAND HOW 
	                                             //  THE MACHINE NOWS WHAT IS "factorial"
	        if (n == 1)
	            return 1;
	        else
	            return n * factorial(n - 1);               // ??
	    }
}
