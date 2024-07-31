class Student{
    String name;
    int roll;
    char grade;
    // creating a constructor
    Student(String name, int roll, char grade)
        {
            this.name=name;
            this.roll=roll;
            this.grade=grade;

    }
    Student(String name, int roll)
    
    {
        this.name=name;
        this.roll=roll;
        this.grade='A';
    }
   void  display()
    {
      System.out.println("The name of the student is: "+name);  
      System.out.println("The roll number of the student is "+roll);
      System.out.println("The grade is "+grade);
    }

}
    
    
    
    
    
    
    
public class OverloadedConstructor 
    {
              public static void main(String args[])
                 {
                    Student student1=new Student("Nandini",122,'B');
                    Student student2=new Student("Raj",121);
                    student1.display();
                    student2.display();
                }
     }
