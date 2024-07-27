class Student{
    int age;
    String name;
    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

 

 // parameterized constructor
 Student(int age,String name)
 {
    this.name=name;
    this.age=age;

 }
}



public class ParameterizedConstructor {
    public static void main(String args[])
    {
        Student s1=new Student(12,"Ari");
        s1.printInfo();
    }
    
}
