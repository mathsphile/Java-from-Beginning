class Node{
    int data;
    Node next;
    Node(int data1,Node next1)
    {
        this.data=data1;
        this.next=next1;

    }
    Node(int data1)
    {
        this.data=data1;
        this.next=null;
    }
}
public class Length{
    public static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++)
        {
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static int getLength(Node head)
    {
        int cnt=0;
        while(head!=null){
            head=head.next;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {

        int[] arr={1,2,36,67,5,4,3};
        Node head=convertArr2LL(arr);
        System.out.println(getLength(head));
    }

}
