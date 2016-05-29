package CCD.LinkedLists;

import java.util.Scanner;
/**
 * Created by akash on 5/28/16.
 */

// Problem

// Solution
//  we will start a pointer from head and move it to k nodes, then will take another pointer from head and move them
// simultaneously, till the front pointer reaches end, next one will reach k nodes from end.

// Complexity
// We will be just iterating over the list, till we reach the position thus complexity is O(n)

public class KElementFromLastQ2 extends LinkedList{

    public static void main(String[] args){

        KElementFromLastQ2 kl = new KElementFromLastQ2();
        LinkedList ll = new LinkedList();

        Scanner sc = new Scanner(System.in);

        // Assigned a Linked List with 20 random values
        for(int i=0; i<20; i++){
            int random = (int)(Math.random()*10 +1);
            ll.insertNode(random);
        }

        ll.printList();
        System.out.println("\n Enter the position i.e. Kth Position from last(Take starting position as 1)");
        int pos = sc.nextInt();

        kl.getKEelementfromLast(ll,pos);

    }

    public void getKEelementfromLast(LinkedList ll, int pos){
        Node front = ll.getHead();
        Node behind = ll.getHead();;
        int index =1;
        boolean flag = false;

        while(front != null){

            if(index > pos){
                flag = true;
                front = front.next;
                behind = behind.next;
            }
            else
                front = front.next;

            index++;
        }

        if(flag)
            System.out.println("Element is " + behind.data);
        else
            System.out.println("Wrong Position");
    }

}
