package examples.class1;

/**
 * This class demonstrates range for some of the Java primitive datatypes
 * @author SummerCamp Teacher1
 * @version 1.0
 */

public class JavaDataTypes {
    
    public static void main (String args[]) {
        
        print_datatype_size_range("boolean",1,false);
        print_datatype_size_range("byte",8,true);
        print_datatype_size_range("short",16,true);
        print_datatype_size_range("int",32,true);
        print_datatype_size_range("long",64,true);
        
//        int a = 2;
//        int b = 32;
//        System.out.println("*****************************************************");
//        System.out.println("int a = " + a + ", int b = " + b);
//        System.out.println("a * b = " + a*b);
//        System.out.println("a/b = " + a/b);
//        System.out.println("exponent of base a to power b = " + expontiate(a, b));
//        
//        System.out.println("*****************************************************");
//        
//        float c = a;
//        float d = b;
//        System.out.println("float c = " + c + ", float d = " + d);
//        System.out.println("c * d = " + c*d);
//        System.out.println("c/d = " + c/d);
//        System.out.println("exponent of base c to power d = " + expontiate(c, d));
//        System.out.println("*****************************************************");

    }
    
    static void print_datatype_size_range(String type,int numberOfBits,boolean isSigned) {
        if (isSigned) {
            double maxValue = Math.pow(2, numberOfBits-1) - 1;
            System.out.println("Dataype:"+type + ",numberOfBits:"+numberOfBits+",Range:-"+ (maxValue+1) + " to +" + maxValue);
        } else {
            double maxValue = Math.pow(2, numberOfBits) - 1;
            System.out.println("Dataype:"+type + ",numberOfBits:"+numberOfBits+",Range:"+ 0 + " to +" + maxValue);
        }

    }
    
    
    public static int expontiate(int base,int exponent) {
        if (base == 0) {
            return 0;
        } else if (exponent == 0) {
            return 1;
        } else {
            int result = 1;
            int left = exponent;
            
            do {
                result = result * base;
                left = left - 1;
            } while (left > 0);
            
            return result;
        }
    }
    
    public static float expontiate(float base,float exponent) {
        if (base == 0) {
            return 0;
        } else if (exponent == 0) {
            return 1;
        } else {
            float result = 1;
            float left = exponent;
            
            do {
                result = result * base;
                left = left - 1;
            } while (left > 0);
            
            return result;
        }
    }
    
}
