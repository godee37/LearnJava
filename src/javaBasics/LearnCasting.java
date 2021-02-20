package javaBasics;

import java.util.Scanner;

public class LearnCasting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name \n");
        String name = scanner.next();

        System.out.println("Please enter your last name \n");
        String last_name =   scanner.next();
        scanner.close();
    }

}
