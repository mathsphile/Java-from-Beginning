import java.util.*;
public class Rectangle {
    double height;
    double width;

    Rectangle() {
        height = 1;
        width = 1;
    }

    Rectangle(double h, double w) {
        this.height = h;
        this.width = w;
    }

    double calculatePerimeter() {
        return 2 * (height + width);
    }

    double calculateArea() {
        return (height * width);
    }

    void display() {

        System.out.println("The perimeter of the rectangle is: " + calculatePerimeter());

        System.out.println("The area of the reactangle is : " + calculateArea());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the rectangle");
        double height = sc.nextDouble();
        System.out.println("Enter the width of the rectangle ");
        double width = sc.nextDouble();
        Rectangle recObj = new Rectangle(height, width);
        recObj.display();
        sc.close();

    }
}
