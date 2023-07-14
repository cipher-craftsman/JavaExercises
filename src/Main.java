
// intro to methods 

public class Main {

    public static void main(String[] args) {

        welcome();
        thank();
        name();
        age();
        multiply(2, 6);
        divide(10, 2);
        add(20, 20);
        subtract(4, 2);
        tall();
        weight();

    }

    public static void welcome() {
        System.out.println("Welcome to the program");
    }

    public static void weight() {
        System.out.println("85");
    }

    public static void name() {
        System.out.println("Jack Bauer");
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void age() {
        System.out.println("You are\t" + 28 + "\tyears old");
    }

    public static void thank() {
        System.out.println("Thank you for attending");
    }

    public static  void tall() {
        System.out.println(181.2);
    }

}
//  Ex 1. Write a Java method to find the smallest number among three numbers.

import java.util.Scanner;
public class main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
    }

    public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }
}
