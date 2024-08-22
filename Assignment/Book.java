class book {
    String title;
    String author;
    float price;

    // parameterized constructor
    book(String t, String a, float p) {
        title = t;
        author = a;
        price = p;

    }

    void display() {
        System.out.println("The name of the book is " + title);
        System.out.println("The author is " + author);
        System.out.println("The price is " + price);
    }

}

public class Book {
    public static void main(String[] args) {
        // creating an object of the class
        book book1 = new book("A girl in room 105", "Chetan Bhagat", 160);
        // displaying the function
        book1.display();
    }
}
