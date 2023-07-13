public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println("Box 2");
    }
}

// methods 

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
