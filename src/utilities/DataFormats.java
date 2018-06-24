package utilities;

import exception.DataFormatException;
import static exception.DataFormatException.FormatExceptionType.*;

/**
 * @author SummerCamp Teacher1
 * @version 1.0
 * This class contains utility methods to convert decimal to binary and binary back to decimal
 */

public class DataFormats {
    
    
    public static void main (String args[]) throws DataFormatException {
        long decimal = 5;
        String binary = decimalToBinary(decimal);
        System.out.println(String.format("Binary form of decimal %s is %s",decimal,binary));
        System.out.println(String.format("Decimal form of binary %s is %s",binary,decimal));
    }
    
    public static String decimalToBinary(long decimal) {
        
        StringBuilder sb = new StringBuilder();
        
        if (decimal == 1 || decimal == 0) {
            return decimal +"";
        }
        
        int divisor = 2;
        
        long quotient = 0;
        
        while ( (quotient = decimal / divisor) > 0) {
            sb.append(decimal % divisor);
            decimal = quotient;
        }
        sb.append("1");
        
        return sb.reverse().toString();
        
    }
    
    public static long binaryToDecimal(String binary) throws DataFormatException {
        if (binary == null || binary.trim().length() == 0) {
            throw new DataFormatException(EMPTY_BINARY_VALUE, binary);
        } else {
            long decimal = 0;
            StringBuilder sb = new StringBuilder(binary);
            for (int i = 0; i < sb.length();i++) {
                int ele = Integer.parseInt(sb.substring(i, i+1));
                decimal = decimal + ele * (long)Math.pow(2,binary.length()-i-1);
            }
            return decimal;
            
        }
    }
    
}
