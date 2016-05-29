package CCD.LinkedLists;

/**
 * Created by akash on 5/28/16.
 */

class Node{
    int data;
    Node next = null;

    Node (int data){
        this.data = data;
    }
}

class LinkedList {

    private Node head, temp;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    protected void insertNode(int data){

        Node node = new Node(data);

        if(head == null) {
            head = node;
            return;
        }

        temp = head;
        while(temp.next != null)
            temp = temp.next;

        temp.next = node;

    }

    protected void deleteNode(int data) {
        temp = head;
        if(head != null && temp.data == data){
            head = head.next;
            return;
        }
        Node prev = temp;
        temp = temp.next;
        while (temp != null) {
            if(temp.data == data) {
                prev.next = temp.next;
                break;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }
    }

    protected void printList(){
        temp = head;
        System.out.println("Linked List ");
        while(temp != null){
            System.out.print(" -> " + temp.data);
            temp = temp.next;
        }
    }

}

