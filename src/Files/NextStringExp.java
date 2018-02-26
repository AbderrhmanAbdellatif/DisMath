package Matrix;

public class NextStringExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String text="101101";
    int k=0;
    char temp[]=text.toCharArray();
     for (int i =temp.length-1; temp[i]=='1'; i--) {
         	if(temp[i]=='0') {
         		temp[i]='1';
         		break;
         	}
         		 temp[i]='0';
         	}
     
     System.out.println(new String(temp));
     		
     }
	
	
	
  
}
