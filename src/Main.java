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
// Write a Java program to find the value of a specified expression.

public class Solution {
	public static void main(String[] args) {
		int r1 = (101 + 0) / 3;
		double r2 = 3.0e-6 * 10000000.1;
		boolean r3 = true && true;
		boolean r4 = false && true;
		boolean r5 = (false && false) || (true && true);
		boolean r6 = (false || false) && (true && true);
		
		System.out.println("(101 + 0) / 3)-> " + r1);
		System.out.println("(3.0e-6 * 10000000.1)-> " + r2);
		System.out.println("(true && true)-> " + r3);
		System.out.println("(false && true)-> " + r4);
		System.out.println("((false && false) || (true && true))-> " + r5);
		System.out.println("(false || false) && (true && true)-> " + r6);
	}
}


//Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
         int num1 = in.nextInt();
         System.out.print("Input second number: ");
         int num2 = in.nextInt();
		 System.out.print("Input third number: ");
         int num3 = in.nextInt();
         System.out.print("Input fourth number: ");
         int num4 = in.nextInt();		
		
		if (num1 == num2 && num2 == num3 && num3 == num4) 
		  {
			System.out.println("Numbers are equal.");
                               }
		else
			{
			System.out.println("Numbers are not equal!");
		}
	}
}

//Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
         double n1 = in.nextDouble();
         System.out.print("Input second number: ");
         double n2 = in.nextDouble();
		 System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
	}
}

// Write a Java program to print the contents of a two-dimensional Boolean array where t represents true and f represents false.
// Sample array:
// array = {{true, false, true},
// {false, true, false}};ort java.util.Scanner;

import public class Solution {
	public static void main(String[] args) {
		boolean[][] array = {{true, false, true},
							 {false, true, false}};
		int rows_length = array.length;
		int columns_length = array[0].length;
		
		for (int i = 0; i < rows_length; i++) {
			for (int j = 0; j < columns_length; j++) {
				
				if (array[i][j]) {
					System.out.print(" t ");
				} else {
					System.out.print(" f ");
				}
				
			}
			System.out.println();
		}	
    }
}

// Write a Java program to print an array after changing the rows and columns of a two-dimensional array. 
//Original Array:
//10 20 30
//40 50 60
//After changing the rows and columns of the said array:10 40
//20 50
//30 60

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		int[][] twodm = {
				{10, 20, 30},
				{40, 50, 60}
		};
		System.out.print("Original Array:\n");
		print_array(twodm);
		System.out.print("After changing the rows and columns of the said array:");
		transpose(twodm);
		}
	
	private static void transpose(int[][] twodm) {
		
		int[][] newtwodm = new int[twodm[0].length][twodm.length];
		
		for (int i = 0; i < twodm.length; i++) {
			for (int j = 0; j < twodm[0].length; j++) {
				newtwodm[j][i] = twodm[i][j];
			}
		}
		
		print_array(newtwodm);
	}
	private static void print_array(int[][] twodm) {
		for (int i = 0; i < twodm.length; i++) {
			for (int j = 0; j < twodm[0].length; j++) {
				System.out.print(twodm[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}

//Write a Java program to create a two-dimensional array (m x m) A[][] such that A[i][j] is false if I and j are prime otherwise A[i][j] becomes true.
import java.util.Scanner;
public class Solution {
	public static int prime_cell(int a, int b) {
		if (a == 0 || b == 0) {
			return 1;
		}
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		if (a % b == 0) 
		{
			return b;
		} 
		else 
		{
			return prime_cell(b, a % b);
		}
	}
	
	public static void main(String[] args) {
		int n = 3;
		boolean[][] A = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = prime_cell(i, j) == 1;
				System.out.print(A[i][j] + " ");
			}
			System.out.println();

		}
	}
}


	









