
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
	loud();

    }
    public static void loud() { System.out.println("Yes!");}


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
// Ex 3. Write a Java method to display the middle character of a string.

import java.util.Scanner;
public class Exercise3 {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();
        System.out.print("The middle character in the string: " + middle(str)+"\n");
    }
 public static String middle(String str)
    {
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}
// Ex 4. Write a Java method to count all vowels in a string
import java.util.Scanner;
public class Exercise4 {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();

        System.out.print("Number of  Vowels in the string: " + count_Vowels(str)+"\n");
    }
 public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}

// Write a Java method to count all the words in a string.

import java.util.Scanner;
public class Exercise5 {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();

        System.out.print("Number of words in the string: " + count_Words(str)+"\n");
    }

 public static int count_Words(String str)
    {
       int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }
        return count; // returns 0 if string starts or ends with space " ".
    }
 }
// Write a Java method to compute the sum of digits in an integer.

import java.util.Scanner;
public class Exercise6 {

  public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Input an integer: ");
      int digits = in.nextInt();
	  System.out.println("The sum is " + sumDigits(digits));
    }

 public static int sumDigits(long n) {
		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}
		
		return result;
	}
	
 }

// Write a Java method to display the first 50 pentagonal numbers.
// Note: A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon, 
// but, unlike the first two, the patterns involved in the construction of pentagonal numbers are not rotationally symmetrical.

import java.util.Scanner;
public class Exercise7 {
public static void main(String[] args) {
   		int count = 1;
		for(int i = 1; i <= 50; i++){
			System.out.printf("%-6d",getPentagonalNumber(i));
			if(count % 10 == 0) System.out.println();
			count++;
		}
    }
  public static int getPentagonalNumber(int i) {
		return (i * (3 * i - 1))/2;
	}
}

// Write a Java method to compute the future investment value at a given interest rate for a specified number of years

import java.util.Scanner;
public class Exercise8 {
 
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    System.out.print("Input the investment amount: ");
 	double investment = in.nextDouble();
 	System.out.print("Input the rate of interest: ");
	double rate = in.nextDouble();
	System.out.print("Input number of years: ");
	int year = in.nextInt();
	
	rate *= 0.01;
	
	System.out.println("Years    FutureValue");
	for(int i = 1; i <= year; i++) {
    	int formatter = 19;
	    if (i >= 10) formatter = 18;
		System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
       }
	 }
 
 public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
} 
// Write a Java method to print characters between two characters (i.e. A to P).
public class Exercise9 {
   public static void main(String[] args) {
        print_Chars('(', 'z', 20);
    }
 public static void print_Chars(char char1, char char2, int n) {
        for (int ctr = 1; char1 <= char2; ctr++, char1++) {
            System.out.print(char1 + " ");
            if (ctr % n == 0) System.out.println("");
        }
		System.out.print("\n");
    }
}

// Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
import java.util.Scanner;

public class Exercise10 {
 
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = in.nextInt();

        System.out.println(is_LeapYear(year));
    }
 
 public static boolean is_LeapYear(int y)
    {
        boolean a = (y % 4) == 0;
        boolean b = (y % 100) != 0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));

        return a && (b || c);
    }
}
// Write a Java method to check whether a string is a valid password.
// Password rules:
// A password must have at least ten characters.
// A password consists of only letters and digits.
// A password must contain at least two digits.

import java.util.Scanner;

public class Exercise11 {
    
public static final int PASSWORD_LENGTH = 8;

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();

        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }

    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}

import java.awt.*;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Date;

public class Main {

    public static void  main(String[] args) {
        String message = "This will manage the returns Lili and her Buza\n ";
        System.out.println(message.length());
        System.out.printf(message);
        System.out.println(message.indexOf("w"));
        System.out.println(message.getBytes());
        System.out.println(message.toUpperCase());
        System.out.println(message.hashCode());
        System.out.println(message.replace("Lili and her Buza", "Odd numbers"));

    }
}


	









