// (Q2.3)Create a Geometry class with overloaded area methods:● Define a Geometry class with overloaded methods to calculate the area of a ///circle, a rectangle, and a triangle.● Implement methods area(double radius), area(double length, double width), and area(double base, double //height, boolean isTriangle). ● Write a display method to print the area calculations for each shape.

class Geometry {
    // Method to calculate the area of a circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0.0; // Returning 0.0 if isTriangle is false (shouldn't happen in this context)
    }

    // Display method to print the area calculations for each shape
    void display() {
        double circleArea = area(5.0); // Example radius
        double rectangleArea = area(4.0, 6.0); // Example length and width
        double triangleArea = area(3.0, 7.0, true); // Example base and height

        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Area of the triangle: " + triangleArea);
    }
}

public class Overloading2 {
    public static void main(String args[])
    {
        Geometry g=new Geometry();
        g.display();
    }
    
}
