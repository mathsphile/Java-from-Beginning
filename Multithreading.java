class Hi extends Thread {
    public void run() {
        for(int i=0;i<=6;i++){
            
        System.out.println("Hi");
        try{Thread.sleep(1000);}
        catch(Exception e){}
    }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 0; i <= 6; i++) {

            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
public class Multithreading{
    public static void main(String args[])
    {
        Hi t1=new Hi();
        Hello t2=new Hello();
        t1.start();
        try{Thread.sleep(10);}
        catch(Exception e){}
        t2.start();
    }
}

    