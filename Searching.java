import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }

}

public class Searching {
    public static Node convertArr2LL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null; // Handle empty array case
        }
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static int traverser(Node head, int val) {
        Node mover = head;
        while (mover != null) {
            if (mover.data == val) {
                return 1; // Found the value, return 1
            }
            mover = mover.next;
        }
        return 0; // Value not found, return 0
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 9, 0, 3, 2};
        Node head = convertArr2LL(arr);
        int val = 8;
        System.out.println(traverser(head, val));

        int[] arr2 = {};
        Node head2 = convertArr2LL(arr2);
        int val2 = 8;
        System.out.println(traverser(head2, val2));

        int[] arr3 = {1,2,3,4,5};
        Node head3 = convertArr2LL(arr3);
        int val3 = 6;
        System.out.println(traverser(head3, val3));
    }
}
