class Pen{
    String color;
    String type;
    public void write()
    {
        System.out.println("Writing something");
    }
    public void isColor()
    {
        System.out.println("The color of pen is "+this.color);
    }
} 


public class OOPs {
    public static void main(String args[])
    {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";
        Pen pen2=new Pen();
        pen2.color="red";
        pen2.type="ball";
        pen1.write();
        pen2.isColor();
    }
}
