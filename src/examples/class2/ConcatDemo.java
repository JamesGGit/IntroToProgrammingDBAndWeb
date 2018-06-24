package examples.class2;

/**
 * This source code is copied from https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
 * and it demonstrates the concatenation of Strings
 */

class ConcatDemo {
    public static void main(String[] args){
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);
    }
}