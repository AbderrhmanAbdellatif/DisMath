package Matrix;

import java.util.Scanner;

public class coefficent {
    // a=2,b=3,n=4,s=2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner=new Scanner(System.in);
	  System.out.print("x :");
       int  x=scanner.nextInt();
	   System.out.print("y :");
	   int y=scanner.nextInt();
       System.out.print("n :");
       int n= scanner.nextInt();
       System.out.print("s :");
       int s=scanner.nextInt();
       long value=0;
      for (int i = 0; i <n; i++) {
		 value =(long) (C(n,s)*Math.pow(x,n-s)*Math.pow(y, s));
	  }
      System.out.println(value);
	}
	public static long  C(int n ,int r) {
		return(fak(n)/(fak(r)*fak(n-r)));
	}
	 public static long fak(long j) {
			long num;
		   long fact=1;
		    num = (long) j;
		    for (int i=2;i<=num; i++){
		        fact=fact*i;
		    }
		   return  fact;
	  } 
}
