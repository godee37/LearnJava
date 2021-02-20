package package2;

import demo.MethodPractice;

public class Dummy {


public static void main(String[] args) {


        //declaration           initialization
        ObjectPhone iphone = new ObjectPhone(); //objectPhone is the name of class and is a data type.
        // iphone is a object name
        // new is java keyword for creating new object instances
        // objectphone() is the constructor that is used to build the new type of a class
        ObjectPhone android = new ObjectPhone();
        ObjectPhone airPlane = new ObjectPhone();



//        airPlane.size = 512; //I was able to reference this variable with no problem
        airPlane.makeCall();// It seems that you can only call makeCall methods directly





        //building/creating objects of the ObjectPhone class
        iphone.color = "black"; // creating an object to access a non static variable
        android.color = "Red";
        iphone.isSmartPhone = true;
        iphone.manufacturer = "Apple";
        iphone.memory = 512;



        //Print the a variable of the object
        System.out.println(iphone.color);
        System.out.println(android.color);
        System.out.println(iphone.manufacturer);
//        ObjectPhone android;
        System.out.println(MethodPractice.addition());// calling a method from a different package
        System.out.println(MethodPractice.b);// called a variable from different package


        iphone.makeCall();

    }


}