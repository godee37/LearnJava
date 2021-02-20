package package2;

import demo.MethodPractice;

public class ObjectPhone {

//A class a s blueprint
// Every class has two thing - state and behavior
//state - string color, string manufacturer, int size, int diamension  they become the variables
//behavior - makeCall, doTest, takePicture ; they become the method because some method can perform an action
public static void main(String[] args) {
    System.out.println("CALL A STATIC METHOD FROM A STATIC METHOD within the same class " + trial()); //calling methods from different class
    System.out.println("CALL A STATIC METHOD FROM A STATIC METHOD " + takePicture());
//    System.out.println("YOU CALL A NON STATIC FROM A NON STATIC METHOD BUT YOU CANNOT CALL A NON STATIC METHOD FROM A STATIC METHOD " + Dummy.);
}

//Every class has a default constructor
//it helps to build a an object of a class
//constructor - every class has a default constructor
//It looks like a method but it has the access identifiers class name and parenthesis; constructed e.g. ObjectPhone()
//data type   object           initialization    constructor
//Phone       iphone         = new                  iPhone

String color;
String manufacturer;
double size;
int memory;
boolean isSmartPhone;
float type;
String strength;



//    public phone(){

//    }

    public  void makeCall() {
        System.out.println("I WANT TO BUY A PHONE");

    }
    public  void doTest() {


}


   public static double takePicture() {
       double resolve = MethodPractice.division() + MethodPractice.addTogether(); // can call static method from  static method
       return  resolve;

   }

    public static double trial () {
     double resulted = MethodPractice.division() + MethodPractice.addTogether(); // can call static method from  static method
        return  resulted;
    }


}