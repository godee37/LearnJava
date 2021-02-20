
// .java is your class
package demo;

import package2.ObjectPhone;
import package2.SampleObject;

// Class code block. A class is keyword word in java. A class begins with uppercase with no space.
// class code begin
//CamelCase.e.g TestClass
//Snake_Case e.g Test_Class
public class TestClass {

 //Global variables are variable declaration out the method but inside the public method
 //e.g int age = 23;
// variables start lower case

    // Java is strongly typed data - you must declare data typed when you create the variable.
  //Method code block begins
  //Method live inside a class




    public static void main(String[] args) {
    SampleObject1 car = new SampleObject1();
    car.asCargo();//"blueblack";// I wanted to create objects of the class but I could not. What is wrong
        car.color = "Blue";





    SampleObject airPlane = new SampleObject();
    airPlane.asCargo();// I wanted to reference the variables of the SampleObject Class but not the methods

    ObjectPhone motor = new ObjectPhone();




    //Local variables are declared inside the class method. It can be used by only the code in the method
    System.out.println("We are learning java");








  //Data types
//        short num= 12345;
//        int fig = 322211155;
//        float temp = 2.123455f;
//        byte box = 127;
//        char letters = 'A';
        //boolean = "True/Force";


// You can declare a string with a Uppercase
        // e.g String name;
        //            name = 5;



    }
//Method code block end


}
//Class block ends