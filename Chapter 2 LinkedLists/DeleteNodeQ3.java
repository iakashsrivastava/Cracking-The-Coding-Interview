package CCD.LinkedLists;

import java.util.Scanner;

/**
 * Created by akash on 5/28/16.
 */

// Problem
// Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.

// Solution
// Since we are given access to only that particular node, we can simply copy the data fromnext node to current node,
// and then delete the last node. However if that is the last node , we cannot delete it.

//Complexity

public class DeleteNodeQ3 {

    public void deleteNode(Node node){

        if(node == null || node.next == null)
            return;

        node.data = node.next.data;
        node.next = node.next.next;
    }
}
