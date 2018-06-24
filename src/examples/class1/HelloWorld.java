package examples.class1;

/**
 * This is a simple class to demonstrate a standalone Java application
 * @author SummerCamp Teacher1
 * @version 1.0
 */

public class HelloWorld {
    
    public static void main (String args[]) {
        System.out.println("Hello World!");
        System.out.println("Argument passed in on command line are " + args);
        System.out.println("Length of array argument passed in on command line " + args.length);
        
        if (args.length >= 1) {
            System.out.println("args[0] is of type String :"+ args[0] instanceof String );
        }
        
        //Everything read from command line is of type String that can be cast to more appropriate type
        //Concatenating of Strings
    }
}
