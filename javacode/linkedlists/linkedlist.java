package linkedlists;
import java.util.*;

class Node{
    Node next = null;
    int data;

    public Node(int d){
        data = d;
    }
    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
        System.out.println(d + " Appended to end of List");
    }

    public static void main(String args[]){
        Node list = new Node(6);
        list.appendToTail(5);
    }
}
