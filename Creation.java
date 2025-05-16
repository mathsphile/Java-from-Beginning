class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class Creation{
    public static void main(String args[]){
        int[] arr={2,3,45,5,6};
        Node y=new Node(arr[3]);
        System.out.print(y.data);
    }
}