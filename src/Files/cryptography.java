package Matrix;

public class cryptography {
	
    	public static void main(String[] args) {
            System.out.println(degistirme("MEET YOU IN THE PARK"));
    	}
    	public static String degistirme(String cumle) {
    		char kelme[]=cumle.toCharArray();
    	    char c; 
    		for (int i = 0; i <kelme.length; i++) {
    			if (kelme[i]==32)c=32;else c=(char) (kelme[i]+3);
    			kelme[i]=c;
    		}
    	     String yeniK=" ";
    	    for (int i = 0; i < kelme.length; i++) {
    			yeniK+=kelme[i];
    		}
    	    return yeniK;
    	}
}
