package mypack;

class book
{
    String title;
    String author;
    float price;
    book(String t,String a,float p)
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
public class MyPackageClass {
    public static void main(String[] args) {
        System.out.println("This is my package!");
        book book1=new book("A girl in room 105","Chetan Bhagat",160);
        book1.display();
        
    }
}
