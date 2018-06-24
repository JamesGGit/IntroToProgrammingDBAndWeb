package examples.class2;

public class VariableTypes {
    private int instanceVariable = 0;//instance level variable
    private static int staticVariable = 0;//class level variable
    
    public static void main(String args[]) {
        //Remind that args are parameters to the main method
        
        //Create an instance of VariableTypes
        VariableTypes variableTypes1 = new VariableTypes();
        //Use the instance reference to reference the instance variable as each instance has its own separate copy of this variable
        variableTypes1.instanceVariable = variableTypes1.instanceVariable + 1;
        //Use the class to reference the static variable as it only exists at class level
        VariableTypes.staticVariable = VariableTypes.staticVariable + 1;
        System.out.println("Value of instanceVariable:"+ variableTypes1.instanceVariable);
        System.out.println("Value of staticVariable:"+ VariableTypes.staticVariable);

        //Create a second instance of VariableTypes
        VariableTypes variableTypes2 = new VariableTypes();
        variableTypes2.instanceVariable = variableTypes2.instanceVariable + 1;
        VariableTypes.staticVariable = VariableTypes.staticVariable + 1;
        System.out.println("Value of instanceVariable:"+ variableTypes2.instanceVariable);
        System.out.println("Value of staticVariable:"+ VariableTypes.staticVariable);
        
        //Now for local variables. Scope is only within a method and they cannot be accesed outside
        int a = 10;
        System.out.println("Value of a is " + a);
        
        //invoke another method to test if local variable a can be referenced outside this method
        invokeAnotherMethod();
        
    }
    
    public static void invokeAnotherMethod() {
//        System.out.println("Value of staticVariable:"+ staticVariable);
//        System.out.println(instanceVariable);
//        System.out.println(a);
    }
}
