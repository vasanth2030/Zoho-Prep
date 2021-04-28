package Zoho;
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}
public class SortedInsertCircularLinkedlist {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(40);
        head.next.next=new Node(50);
        head=sortedInsert(head,30);
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }


    }
    public static Node sortedInsert(Node head,int data)
    {
        Node temp=new Node(data);
        Node curr=head;
        //if given data less than head's data
        if(data<head.data)
        {
            while(curr.next!=head)
            {
                curr=curr.next;
            }
            curr.next=temp;
            temp.next=head;
            return temp;
        }
        //if the linked list is empty
        else if(head==null)
        {
            temp.next=temp;
            return temp;
        }
        //for any mid elements
        else
        {
            while(temp.data>curr.next.data)
            {
                curr=curr.next;
            }
            temp.next=curr.next;
            curr.next=temp;
            return head;

        }
        //add code here.
    }
}

