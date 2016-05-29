package CCD.LinkedLists;

/**
 * Created by akash on 5/28/16.
 */

// Problem
// Implement a function to check if a linked list is a palindrome

// Solution
// Iterate over the list in two parts
// reverse the first half
// compare it with the second half

// Complexity
// Since we are iterating over the list once with no other functionalities other then swapping, complexity is O(1)

class PalindromeListQ6 {

    public boolean isPalindrome(Node head) {
        if(head == null){
            return true;
        }
        Node rev = head;
        Node fast = head;
        Node temp = head;
        Node slow = head.next;

        //find mid pointer, and reverse head half part
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            temp = rev;
            rev = slow;
            slow = slow.next;
            rev.next = temp;
        }

        //odd number of elements, need left move slow one step
        if(fast.next == null) {
            rev = rev.next;
        }
        else {   //even number of elements, do nothing

        }
        //compare from mid to head/tail
        while(slow != null) {
            if(rev.data != slow.data) {
                return false;
            }
            rev = rev.next;
            slow = slow.next;
        }
        return true;
    }
}
