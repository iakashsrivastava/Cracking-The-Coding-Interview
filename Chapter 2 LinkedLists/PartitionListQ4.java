package CCD.LinkedLists;

/**
 * Created by akash on 5/28/16.
 */

// Problem
// Write code to partition a linked list around a value x, such that all nodes less than x come before alt nodes greater
// than or equal to x.

// Solution
// Create two Seprate lists one for lesser value and one for bigger values and then merge both

// Complexity
public class PartitionListQ4 {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        PartitionListQ4 pl = new PartitionListQ4();

        // Assigned a Linked List with 20 random values ranging from 0 to 20
        for(int i=0; i<20; i++){
            int random = (int)(Math.random()*20 +1);
            ll.insertNode(i);
        }

        ll.printList();

        pl.partitionList(ll,11);

        ll.printList();

    }

    public void partitionList(LinkedList ll, int value){

        Node less = null,more =null;

        Node temp = ll.getHead();

        while(temp != null){

            Node node = new Node(temp.data);

            if(temp.data <= value) {
                node.next = less;
                less = node;
            }
            else {
                node.next = more;
                more = node;
            }

            temp = temp.next;
        }
        temp = less;
        while(less.next != null)
            less  = less.next;

        less.next = more;
        ll.setHead(temp);
    }
}
