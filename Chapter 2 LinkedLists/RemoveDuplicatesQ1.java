package CCD.LinkedLists;

import java.util.HashSet;
/**
 * Created by akash on 5/28/16.
 */

// Problem
// Write code to remove duplicates from an unsorted linked list.

// Solution
// Will be using inbuilt Linkedlist provided with Java.
// Add all the elements of linked list in a hashset, if duplicate remove

// Complexity
// O(n)

public class RemoveDuplicatesQ1 extends LinkedList{

    public static void main(String[] args){

        LinkedList ll = new LinkedList();
        RemoveDuplicatesQ1 rd = new RemoveDuplicatesQ1();

        // Assigned a Linked List with 20 random values
        for(int i=0; i<20; i++){
            int random = (int)(Math.random()*10 +1);
            ll.insertNode(random);
        }

        ll.printList();

        rd.removeDuplicates(ll);

        ll.printList();

    }

    public void removeDuplicates(LinkedList ll){

        Node temp = ll.getHead();
        Node prev = null;
        HashSet<Integer> hs = new HashSet<Integer>();

        if(temp != null){

            hs.add(temp.data);
            prev = temp;
            temp = temp.next;
        }
        while(temp != null){
            if(hs.add(temp.data))
                prev = temp;
            else
                prev.next = temp.next;
            temp = temp.next;
        }
    }
}
