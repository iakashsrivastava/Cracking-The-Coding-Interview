package CCD.LinkedLists;

/**
 * Created by akash on 5/28/16.
 */

// Problem
// Given a circular linked list, implement an algorithm which returns the node at the beginning of the loop.

// Solution
// Take two pointers make one jump two places at at time while other one, if they meet definately theres a loop, once the
// loop is detected make them both itearte over the list at same speed, i.e. one step at a time, the point they meet, its
// the starting point


public class ListWithLoopQ6 {

    public Node loopedNode(LinkedList l1){
        Node fast = l1.getHead();
        Node slow = l1.getHead();

        while(fast != null && fast.next != null){

            if(fast != slow){
                fast = fast.next.next;
                slow = slow.next;
            }
            if(fast == slow)
                break;
        }

        // Error check
        if(fast == null || fast.next ==null)
            System.out.println("The list does not contains loop");

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;

    }

}
