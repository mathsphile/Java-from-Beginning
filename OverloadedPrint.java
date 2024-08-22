// (Q2.2) Create a Printer class with overloaded print methods:
// ● Define a Printer class with overloaded methods to print an integer, a double, and a
// string.
// ● Implement methods print(int a), print(double a), and print(String s).
// ● Write a display method to show the usage of each print method.
class Printer{
    void print(int a)
    {
        System.out.println("The integer value is "+a);
    }
    void print(double a)
    {
        System.out.println("The double value is "+a);
    }
    void print(String s)
    {
        System.out.println("The string value is "+s);
    }
    void display()
    {
        print(3); // this is calling print method of integer
        print(43.9); 
        print("Print");
    }
}
public class OverloadedPrint{
    public static void main(String args[])
    {
        Printer p=new Printer();
        p.display();
    }
}

