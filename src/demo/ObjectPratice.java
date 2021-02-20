package demo;

public class ObjectPratice {

/* declaring constructor- it is implicitly declared whether you explicitly declare it or not
it starts with public followed by the class name.
 */


    //objects od=f a class
    String manufacturer;
    String model;
    int horsePower;
    int wheels;
    static int doors; // Static variables are created only once and are stored in the heap
                        // They are access with the class name because if belongs to CLASS itself but not to the instances of a class

    public ObjectPratice() {

    }


    //Create behavior
    void accelerating() {
        System.out.println(" I am accelerating hard");

    }

    void turnLeft() {
        System.out.println(" I am turning slowly");
    }

    void breaking() {

        System.out.println(" I am breaking slowly");
    }



    public static void main(String[] args) {
        ObjectPratice hondaAccord = new ObjectPratice();
        hondaAccord.manufacturer = "Honda";
        hondaAccord.model = "Accord";
        hondaAccord.horsePower = 188;
        hondaAccord.wheels = 4;
        //accessing a string variable
        ObjectPratice.doors = 4;
       // hondaAccord.door - you can't access a static variable of a class with the instance of the class or an  object

// An instance of a class is the object of a class instance. In another words create an object of a class.

        System.out.println("This is the how to access non static variable of a class " + hondaAccord.wheels);

        System.out.println("\n This is the how to access static variable of a class " + ObjectPratice.doors);

        System.out.println("\n This is the how to access memory address of objects " + hondaAccord );
    }

}




