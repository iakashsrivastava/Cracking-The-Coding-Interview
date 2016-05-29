package CCD.LinkedLists;

import sun.awt.image.ImageWatched;

import java.util.Scanner;

/**
 * Created by akash on 5/28/16.
 */

// Problem
// You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in
// reverse order, such that the 1 's digit is at the head of the list. Write a function that adds the two numbers and
// returns the sum as a linked list.

// Solution
// Itearate over the two linkd lists and add there sum in third linked list

// Complexity
// Since we are iterating over the linkedlist and adding a new node at the end for new list, its complexity will be
// O(m) where m is the size of bigger list

public class AddTwoListsQ5 {

    LinkedList list3 = new LinkedList();
    int carry =0;

    public static void main(String[] args){

        AddTwoListsQ5 kl = new AddTwoListsQ5();
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        // Assigned a Linked List with 5 random values
        for(int i=0; i<9; i++){
            int random = (int)(Math.random()*9 );
            list1.insertNode(random);
        }

        for(int i=0; i<9; i++){
            int random = (int)(Math.random()*9 );
            list2.insertNode(random);
        }

        list1.printList();

        list2.printList();

        kl.addTwoLists(list1.getHead(),list2.getHead());

        kl.list3.printList();

    }

    public void addTwoLists(Node l1, Node l2) {
        int carry =0, sum =0;
        while(l1 != null || l2 != null){

            if(l1 != null && l2 != null){
                sum = l1.data + l2.data+ carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l2 == null){
                sum = l1.data + carry;
                l1 = l1.next;
            }
            else{
                sum = l2.data + carry;
                l2 = l2.next;
            }

            list3.insertNode(sum%10);
            carry = sum /10;
        }
        if(carry > 0)
            list3.insertNode(carry);
    }
}
