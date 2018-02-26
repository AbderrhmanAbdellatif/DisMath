package Matrix;
import java.util.Scanner;
public class File {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static String encrypt(String plainText, int shiftKey)
    {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
          if (plainText.charAt(i)==32) {
				cipherText+=' ';
          }else {
        	int charPosition = ALPHABET.indexOf(plainText.charAt(i));
        	
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
			
          }
        
        }
        return cipherText;
    }
 
   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = new String();
        message = sc.nextLine();
        System.out.println("Enter Key: ");
        int temp=sc.nextInt();
        System.out.println(encrypt(message, temp).toUpperCase());
        sc.close();
    }
}
