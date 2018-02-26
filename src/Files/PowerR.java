package Matrix;

public class PowerR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < 10; i++) {
		        System.out.println(i+"   "+powerN(3, i));
		    }
	}
	public static long powerN(long base, long n) {
	    if (n < 0) {
	        throw new IllegalArgumentException("Illegal Power Argument");
	    }
	    if (n == 0) {
	        return 1;
	    } else {
	        return base * powerN(base, n - 1);
	    }
	}
}
