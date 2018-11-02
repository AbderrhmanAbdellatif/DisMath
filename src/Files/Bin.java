/* *****************************************************************************
 *  Name:    Alan Turing
 *  NetID:   aturing
 *  Precept: P00
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */

import java.util.Scanner;

public class SQL {
    public static void main(String[] args) {
        System.out.print("enter tow Numbers : \n");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        System.out.println("first Numbers :" + toBinary(i));
        System.out.println("tow Numbers :" + toBinary(j));
        System.out.println("binary addition :" + Add(i, j));
        todecimal(toBinary(i));
        todecimal(toBinary(j));
    }

    public static String toBinary(int i) {
        StringBuilder binary = new StringBuilder();
        int n = i;
        while (n > 0) {
            if ((n & 1) == 1) {
                binary.append(1);
            }
            else {
                binary.append(0);
            }
            n >>= 1;
        }
        String number = new String(binary.reverse());
        return number;
    }

    static int Add(int x, int y) {
        // Iterate till there is no carry
        while (y != 0) {
            // carry now contains common
            // set bits of x and y
            int carry = x & y;

            // Sum of bits of x and
            // y where at least one
            // of the bits is not set
            x = x ^ y;

            // Carry is shifted by
            // one so that adding it
            // to x gives the required sum
            y = carry << 1;
        }
        return x;
    }

    static void todecimal(String bin) {
        long n = Long.parseLong(bin);
        int decimal = 0, p = 0;

        while (n != 0) {
            decimal += ((n % 10) * Math.pow(2, p));
            n = n / 10;
            p++;
        }
        System.out.println("the binray is " + bin + " and  the decimal is : " + decimal);
    }

}
