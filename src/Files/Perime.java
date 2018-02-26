package Matrix;

public class Perime {

	public static void main(String[] args) {
		for (int i = 2; i <=100; i++) {
			if (isperime(i)) {
				System.out.print(i+"  ");
			}
		}
	}
	public static boolean isperime(int n) {
		boolean Temp=true;
		for (int i = 2; i <=Math.sqrt(n); i++) {
			if (n%i==0) {
				Temp=false;
				break;
			}
		}
		if (Temp) {return true;}
		else {return false;}
	} 

}
