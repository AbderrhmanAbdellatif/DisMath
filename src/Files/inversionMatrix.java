package Matrix;

public class inversionMatrix {
	public static void inversionarr(double arr[][]) {
	   double det=(1/((arr[0][0]*arr[1][1])-(arr[0][1]*arr[1][0])));
	   double swep=arr[0][0];double swep1=arr[1][1];
	   arr[1][1]=swep;
	   arr[0][0]=swep1;
	   double a=(arr[0][1])*(-1);
	   double b=(arr[1][0])*(-1);
	   arr[0][1]=a;
	   arr[1][0]=b;
	   for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("  "+arr[i][j]*det);
			}
			System.out.println(" ");
		}
	}
	  public static void main(String[] args) {
		  double arr[][]= {{1,-2},{3,4}};
		  for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("   "+arr[i][j]);
			}
			System.out.println(" ");
		}
		  System.out.println("========================= inversionMatrix ===============");
		inversionarr(arr);
		  
	  }
}
