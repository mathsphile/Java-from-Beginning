class Student{
    String name;
    int age;
    public void printInfo()
    {
        System.out.println("The name of the student is"+this.name);
        System.out.println("The age of the student is"+this.age);

    }
}


public class Oops2 {
    public static void main(String args[])
    {
    Student s1=new Student();
    s1.name="Nandini";
    s1.age=20;
    Student s2=new Student();
    s2.name="Rima";
    s2.age=21;
    s1.printInfo();
    s2.printInfo();
    }
}
