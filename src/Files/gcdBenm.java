package Matrix;

public class gcdBenm {
	public static void main(String[] args) {
		int a=662,b=400;
		int asl=0,kalan=0,degersayi=0,fark=0,cd;
		 asl=a;
		 degersayi=b;
		do {
		     kalan=(asl/degersayi);
		     fark=(asl-(degersayi*kalan));
		     System.out.println(asl+" = "+degersayi+" . "+kalan+" + "+fark);
		     asl=degersayi;
			 degersayi=fark;
			 cd=degersayi;
		}while(fark!=0);
		System.out.println("Gcd :  "+gcd(a,b));
	}
	public static int gcd(int a,int b) {
		int x,y,r;
		x=a;
		y=b;
		while(y!=0) {
			r=(x%y);
	        x=y;
	        y=r;
		}
		return x;
	}
	
}
