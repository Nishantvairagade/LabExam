class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;

    public void insert(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void display()
    {
        Node current=head;
        while(current!=null)
        {
            Syatem.out.print(current.data+"");
            current=current.next;
        }
        System.out.println();
    }
    public void main(String args[])
    {
       LinkedList list=new LinkedList();
       list.insert(1);
       list.insert(2);
       list.insert(3);
       list.insert(4);
       list.insert(5);
       list.display();
    

    }


}