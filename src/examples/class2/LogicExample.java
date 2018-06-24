package examples.class2;

import utilities.DataFormats;

/**
 * This is a simple example to demonstrate logic operations
 * @author SummerCamp Teacher1
 */

public class LogicExample {
    
    
    public static void main(String args[]) {
        demonstrateIfConditional(args);
//        demonstrateSwitchConditional(args);
//        demonstrateMultipleConditionalsInIf(args);
        
//        demonstrateBitwiseOr();
//        demonstrateLogicalOr();
//        demonstrateBitwiseAnd();
//        demonstrateLogicalAnd();
        
    }

    /**
     * Simple If example that checks length of arguments passed into program
     */
    public static void demonstrateIfConditional(String args[]) {
        if (args.length == 0) {
            System.out.println("You have not provided any arguments");
        } else if (args.length == 1) {
            System.out.println("Single argument provided was "+args[0]);
        } else {
            System.out.println("More than one argument was provided");
        }
        
    }
    
    /**
     * Simple switch example that checks length of arguments passed into program
     * Use switch over if when considering only a single variable
     */

    //
    public static void demonstrateSwitchConditional(String args[]) {
        switch(args.length) {
            case 0:
                System.out.println("You have not provided any arguments");
                break;
            case 1:
                System.out.println("Single argument provided was "+args[0]);
                break;
            default:
                System.out.println("More than one argument was provided");
            
        }
    }
    
    /**
     * Slightly more complex if example
     * Checks both argument length and argument value
     */
    
    public static void demonstrateMultipleConditionalsInIf(String args[]) {
        if (args.length == 0) {
            System.out.println("You have not provided any arguments");
        } else if (args.length == 1 && args[0].equals("AttentiveStudent")) {
            System.out.println("Good job "+args[0]);
        } else if (args.length == 1 ) {
            System.out.println("Single argument provided was "+args[0]);
        } else {
            System.out.println("More than one argument was provided");
        }
        
    }
    
    public static int bitwiseAnd(int a,int b) {
        int result = a & b;
        return result;
    }
    

    public static int bitwiseOr(int a,int b) {
        int result = a | b;
        return result;
    }


    public static void demonstrateBitwiseAnd() {
        int a = 5;
        int b = 7;
        System.out.println("Bitwise And of " +a + " and " + b + " is " +  bitwiseAnd(a, b));
        System.out.println("Binary representation of " + a + ":" + DataFormats.decimalToBinary(a));
        System.out.println("Binary representation of " + b + ":" + DataFormats.decimalToBinary(b));
    }
    
    public static void demonstrateLogicalAnd() {
        int a = 5;
        int b = 7;
        
        if (a < 6 && b > 6) {
            System.out.println("Logical condition of a less than 6 and b greater than 6 was met");
        } else {
            System.out.println("Logical condition of a less than 6 and b greater than 6 was not met");
        }
    }

    public static void demonstrateBitwiseOr() {
        int a = 5;
        int b = 7;
        System.out.println("Bitwise Or of " +a + " and " + b + " is " +  bitwiseOr(a, b));
        System.out.println("Binary representation of " + a + ":" + DataFormats.decimalToBinary(a));
        System.out.println("Binary representation of " + b + ":" + DataFormats.decimalToBinary(b));
    }

    public static void demonstrateLogicalOr() {
        int a = 5;
        int b = 7;
        
        if (a < 3 || b > 6) {
            System.out.println("Logical condition of a less than 3 or b greater than 6 was met");
        } else {
            System.out.println("Logical condition of a less than 3 or b greater than 6 was not met");
        }
    }
    
    
}
