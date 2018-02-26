package Matrix;
import java.util.Scanner;
public class PC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
		Scanner input = new Scanner(System.in);
		System.out.println("n giriniz");
		int n=input.nextInt();
		System.out.println(" r giriniz ");
		int r=input.nextInt();
		if ((n+r-1)>r || (n+r-1)==r) {
			System.out.println(" c = "+TC(n,r));
		   	System.out.println(" p = "+TP(n,r));
		   	break;
		}else {
			System.out.println(" n r den buyuk ya de estir olmasi lazim  ");
		}
		}while(true);
	}
	public static long  TP(int n ,int r) {
		long tp=(long) Math.pow(n, r);
		return(tp);
	}
	public static long  TC(int n ,int r) {
		long N=n+r-1;
		return(fak(N)/(fak(r)*fak(N-r)));
	}
	/*public static int  C(int n ,int r) {
		return(fak(n)/(fak(r)*fak(n-r)));
	}
	public static int  p(int n ,int r) {
		return(fak(n)/fak(n-r));
	}*/
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

