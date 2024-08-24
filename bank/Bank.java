class Account {
    public String name;
    public String email;
    private int password;

    // if a prop is private there mayebe a method getter and setter
    public void setPass(int password) {
        this.password = password;
    }

    public int getPass() {
        return this.password;
    }

}

class book {
    String title;
    String author;
    float price;

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

public class Bank {
    public static void main(String args[]) {
        Account acc1 = new Account();
        acc1.name = "Nandini";
        acc1.email = "ndas@gmail.com";
        acc1.setPass(1234);
        System.out.println(acc1.name);
        System.out.println(acc1.email);
        System.out.println(acc1.getPass());
        book book1 = new book("A girl in room 105", "Chetan Bhagat", 160);
        book1.display();
    }

}
