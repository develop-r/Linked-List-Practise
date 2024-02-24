class  LL{
Node head;
public  class Node {
    String data;
    Node next;
    Node(String data) {
        this.data = data;
        this.next = null;
    }
}
void addFirst(String data) {
    Node newnode = new Node(data);
    newnode.next = head;
    head = newnode;
}
    void addLast(String data){
        Node newnode = new Node(data);
    if(head==null){
        newnode=head;
    }
        Node currentnode=head;
    while (currentnode.next!=null){
        currentnode=currentnode.next;
    }
   currentnode.next=newnode;
    }
    void deleteFirst(){
    if(head==null){
        System.out.println("List is empty");
    }
    head=head.next;
    }
    void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node slast=head;
        Node last=head.next;
        while(last.next!=null){
          last=last.next;
          slast=slast.next;
        }
        slast.next=null;
    }
    void printAll(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    Node currentnode=head;
    while(currentnode!=null){
        System.out.print(currentnode.data+"->");
        currentnode=currentnode.next;
    }
    System.out.println("null");
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        LL a = new LL();
        a.addFirst("is");
        a.addFirst("String");
        a.addLast("List");
        a.printAll();
        a.deleteFirst();
        a.printAll();
        a.deleteLast();
        a.printAll();
    }
}
