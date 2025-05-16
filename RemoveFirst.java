class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1)
    {
        this.data=data1;
        this.next=null;
    }

}
public class RemoveFirst{
    public static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++)
        {
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
return head;
    }
    public static Node deletion(Node head){
    if(head==null) return head;
    Node temp=head;
    head=head.next;
    return head;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node head=convertArr2LL(arr);
        head=deletion(head);
        System.out.println("List after removal head");
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        }

}

