class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList1{
    Node head,tail;
    public void insert(int data) {
        Node n=new Node(data);
        n.next=null;
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    public void insertAt(int pos,int data)
	{
		 Node n=new Node(data);
		 Node temp=head;
		 for(int i=0;i< pos-1;i++)
		{
			 temp=temp.next;
        }
			 n.next=temp.next;
			 temp.next=n;
	}
    public void deletebag(){
        Node temp=head;
        head=head.next;
        temp.next=null;
    }
    public void display(){
        Node temp=head;
        while(temp!=null) ///traverse line condition
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class LinkedList {
    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(80);
        ll.deletebag();
        ll.insertAt(1,50);
        ll.insertAt(4,70);
        ll.display();
    }
}
