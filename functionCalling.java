import java.util.*;

public class functionCalling {
    public static void printmyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String args[]) {
        System.out.println("Enetr your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printmyName(name);

    }

}