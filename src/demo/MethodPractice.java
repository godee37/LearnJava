package demo;

import package2.ObjectPhone;

public class MethodPractice {
//    Global variable (instant variable) - declared within the class making it access to all class in the package
    static double a = 10;// static global variables can be called from static and non-static methods
    public static double b = 25;

//    //Access modifiers    //                   //The return type             //
    public                static                 void                   main(String[] args) {
        System.out.println(addition());
        System.out.println(division());//
        System.out.println(addTogether());// calling methods from the same class
        System.out.println("CALL A STATIC METHOD FROM A STATIC METHOD " + ObjectPhone.takePicture());
    ObjectPhone maths = new ObjectPhone ();


   ObjectPhone smartPhone = new ObjectPhone();// You can use constructors to call a non static method from another class
    smartPhone.makeCall();// by calling variable and the method
// Access modifiers
// global access - they are accessible to all packages in the source file
// Protected access modifiers - accessible within the same package or sub-class within a package
// Private - only accessible within the class they are declared



//RETURN TYPE

   }
//    method signature
//    it has to be returned
    public static int addition(){
// local variables
        int x = 5;
        int y = 10;
        int z = x + y;

        return z;

}

    public static double division() {
        // Using global variables
        double c = b/a;
        return c;
    }

    public static double addTogether() {
        double result = division() + division();
        return result;
    }
}



//GLOBAL Variabe - cannot be in any class or method
//local variable - are declared inside a method and only access by that method

