package Matrix;

public class constructingBaseExpansion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  t=16526;
		BasaEx(t,16);
		
	}
    static void BasaEx(int gelenRakem,int tablen) {
    	int mod=0;
    	int kalan=0;
    	char hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    	String cevrimsisSayi=" "; 
    	do {
    	 	kalan=(gelenRakem/tablen);
    	 	mod=(gelenRakem%tablen);
    	 	cevrimsisSayi=hex[mod]+cevrimsisSayi;
    		System.out.println(gelenRakem+" = "+tablen+" . "+kalan+"  + "+mod);
    		gelenRakem=kalan;
    	}while(kalan!=0);
    	System.out.println("Hex : "+cevrimsisSayi);
    	
    } 
	
}
