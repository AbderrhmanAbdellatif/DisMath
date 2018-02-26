package Matrix;

import java.util.Scanner;
public class OrtakBolen {
	 public static void main(String[] args) {
		    dondur(42,784);
		    }
		    static void dondur(int a,int b){
		        if(a != b){
		            if(a<b){
		             dondur(b,a);
		            }else{
		              dondur((a-b),b);
		            }
		            
		        }else{
		         System.out.println(a);
		        }
		    }
}

