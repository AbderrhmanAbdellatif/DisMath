package Matrix;

public class Recursivegcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int i=gcd(14,8);
              System.out.println(i);
	}
	public static int gcd ( int x , int y )
	{
	    if ( y == 0 )                        
	        return x;
	    else if ( x >= y && y > 0)
	        return gcd ( y , x % y );
	    else return gcd ( y , x );        // if x < y then go ahead and switch them around.
	}
}
