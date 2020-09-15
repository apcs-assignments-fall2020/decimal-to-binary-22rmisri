// I worked with Chloe Burrows
import java.util.Scanner;
public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int len = binary.length();
        int len2 = len - 1;
        double highest = Math.pow(2, (len2));
        int highest2 = (int)highest;
        int val = 0;
        for (int i = 0; i < len; i++) {
            char a = binary.charAt(i);
            String s = String.valueOf(a);
            if ( s.equals("1") ) {
                val = highest2 + val;
            }
            highest2 = highest2/2;
        }
        return val;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Type in a number in binary format");
        String binary_num = scan.next();
        System.out.println(binaryToDecimal("101"));
    }
}