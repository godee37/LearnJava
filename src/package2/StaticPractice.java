package package2;
// in order to call a global variable you need to make it static
public class StaticPractice {
    //Static variables/methods can be called from static or non static methods
    // Non static variable cannot be accessed by static methods
    //String name = "salim"; this cannot be called in the main public because is static
    static String name = "salim";// this is callable in the main method
    int k = 28;
    static String lastname = "Jonny";

    static int x = 10;
    static int y = 100;
    int product;


    public static void main(String[] args) {
        System.out.println(name);
        //System.out.println(x);// You cannot call a non static variable from static variable
//        printName();//non-static method cannot reference from static method
//
        String last = printLastName();
        System.out.println(last);// referencing a static method from a static method
        System.out.println("This is the same as the upper result println(last) " + printLastName());

        int product = doMultiplication();
        System.out.println(product);

        int way = anotherWayMultiplication();
        System.out.println("This is another way to reference a method " + way);

    }

    public void printName() {
        System.out.println(k);// You can  call non static variable from non static method
        System.out.println(name);// You can  call static variable from a static variable


    }

    public static String printLastName() {
        return lastname;
    }

    public static int doMultiplication() {
        int z = x + y;
        return z;


//        System.out.println(ObjectPhone);

    }

    public static int anotherWayMultiplication() {
         int x = 10;
        int y = 100;
        int z = x + y;
        return z;
    }

}
