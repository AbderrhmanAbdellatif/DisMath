package Matrix;

public class Euclidean {
 static int nwd(int a,int b) {
	 int c;
	 while(b!=0) {
		 c=a%b;
		 a=b;
		 b=c;
	 }
	 return a;
 }
 public static void main(String[] args) {
	 System.out.println( " Euclidean is == "+nwd(122,36));
 }
}
