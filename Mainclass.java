class Book {
    String title;
    String author;
    float price;
    // parameterized constructor
    Book(String t,String a,float p)
    {
        title=t;
        author=a;
        price=p;

    }
    void display()
    {
        System.out.println("The name of the book is " +title);
        System.out.println("The author is "+author);
        System.out.println("The price is "+price);
    }

}
public class Mainclass{
     public static void main(String[] args)
           {
                // creating an object of the class
                 Book book1=new Book("A girl in room 105","Chetan Bhagat",160);
                //displaying the function
                 book1.display();
            }


      }


