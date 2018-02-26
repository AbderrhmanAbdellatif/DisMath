package Matrix;

public class RecursiveModularExponentiation {

	public static void main(String[] args) {
       int i=Mod(73,644,645);
       System.out.println(i);
	}
	public static int Mod(int a, int b, int c) {
	    if(b==0){
	        if(a==0) return 0;
	        else
	        return 1;
	    }
	    else if(b%2==0){
	        long y=Mod(a,b/2,c);

	        return (int)(((long)(y*y))%(long)c);
	    }else{
	        int k=a%c;
	        if(k<0){
	            k+=c;
	        }
	        return (int)(((long)((long)k * (long)Mod(a,b-1,c)))%(long)c);
	    }
	}
}
