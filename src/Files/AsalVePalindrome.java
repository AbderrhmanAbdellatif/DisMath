package Matrix;

import java.util.Scanner;

public class AsalVePalindrome {
	public static void main(String[] args) {
	       Scanner scanner=new Scanner(System.in);
			boolean asal=true;
		   System.out.println("sayi giriniz : ");
			int a=scanner.nextInt();
		    for (int i = 2; i <=Math.sqrt(a); i++) {
				if (a%i==0) {
					asal=false;
					break;
				}
			}
		    int i=Tres(a);
		    if (asal && i==a) {
				System.out.println("Yes");
		    }
		   }
		public static int Tres(int n) {
			int sayi=n,Temp;
			int str = 0 ;
			while(sayi!=0) {
				Temp=sayi%10;
				str=(str*10)+Temp;
				sayi=sayi/10;
			}
			return str;
		}  
}
