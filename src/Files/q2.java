package Matrix;

public class q2 {

	public static void main(String[] args) {
		int XOR[]=new int [10];
		int k=0;
		int kisisim[]= {1,2,3,4,7,8};
		int birlesim[]= {1,2,3,4,5,6};
		for (int i = 0; i < kisisim.length; i++) {
			for (int j = 0; j < birlesim.length; j++) {
				if (kisisim[i]!=birlesim[j]) {
				     XOR[k]=birlesim[i];
				     k++;
				}
			}
		}
		for (int i = 0; i < XOR.length; i++) {
			System.out.println(XOR[i]);
		}
	}

}
