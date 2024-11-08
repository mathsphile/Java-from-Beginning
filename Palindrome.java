import java.util.*;

class Is_Palindrome {
    String str;

    Is_Palindrome(String str) {
        this.str = str;
    }

    void PalindromeOrNot() {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("The string is not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("The string is a palindrome");
    }
}

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Is_Palindrome p = new Is_Palindrome(str);
        p.PalindromeOrNot();
    }

}