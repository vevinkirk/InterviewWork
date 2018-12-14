package linkedlists;

import java.util.*;

class RemoveDuplicates{
    void deleteDups(LinkedListNode head){
        LinkedListNode current = head;
        while(current != null){
            /*remove all future nodes that have the same value*/
            LinkedListNode runner = current;
            while(runner.next != null){
                if(runner.next.data == current.data){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}
