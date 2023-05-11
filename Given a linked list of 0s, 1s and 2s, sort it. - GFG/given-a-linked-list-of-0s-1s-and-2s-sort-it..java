//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        Node node0 = null, node1 = null, node2 = null;
        Node node0Tail = null, node1Tail = null, node2Tail = null;

        Node curr = head;
        while (curr != null) {
            if (curr.data == 0) {
                if (node0 == null) {
                    node0 = curr;
                    node0Tail = curr;
                } else {
                    node0Tail.next = curr;
                    node0Tail = curr;
                }
            } else if (curr.data == 1) {
                if (node1 == null) {
                    node1 = curr;
                    node1Tail = curr;
                } else {
                    node1Tail.next = curr;
                    node1Tail = curr;
                }
            } else {
                if (node2 == null) {
                    node2 = curr;
                    node2Tail = curr;
                } else {
                    node2Tail.next = curr;
                    node2Tail = curr;
                }
            }
            curr = curr.next;
        }

        // Link the three groups together
        if (node0 != null) {
            head = node0;
            if (node1 != null) {
                node0Tail.next = node1;
                if (node2 != null) {
                    node1Tail.next = node2;
                    node2Tail.next = null;
                } else {
                    node1Tail.next = null;
                }
            } else if (node2 != null) {
                node0Tail.next = node2;
                node2Tail.next = null;
            } else {
                node0Tail.next = null;
            }
        } else if (node1 != null) {
            head = node1;
            if (node2 != null) {
                node1Tail.next = node2;
                node2Tail.next = null;
            } else {
                node1Tail.next = null;
            }
        } else {
            head = node2;
            node2Tail.next = null;
        }

        return head;
    }
}



