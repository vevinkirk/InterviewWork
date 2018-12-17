import java.util.*;

class RemoveDups{

  public static void main(String[] args){
    /* Linked List Declaration */
  LinkedList LinkedListNode = new LinkedList();

  /*add(String Element) is used for adding
   * the elements to the linked list*/
  LinkedListNode.add(1);
  LinkedListNode.add(2);
  LinkedListNode.add(3);
  LinkedListNode.add(4);
  LinkedListNode.add(5);

  /*Display Linked List Content
  System.out.println("Linked List Content: " +LinkedListNode);

  /*Add First and Last Element
  LinkedListNode.addFirst("First Item");
  LinkedListNode.addLast("Last Item");
  System.out.println("LinkedList Content after addition: " +LinkedListNode);

  /*This is how to get and set Values
  Object firstvar = LinkedListNode.get(0);
  System.out.println("First element: " +firstvar);
  LinkedListNode.set(0, "Changed first item");
  Object firstvar2 = LinkedListNode.get(0);
  System.out.println("First element after update by set method: " +firstvar2);

  /*Remove first and last element
  LinkedListNode.removeFirst();
  LinkedListNode.removeLast();
  System.out.println("LinkedList after deletion of first and last element: " +LinkedListNode);

  /* Add to a Position and remove from a position
  LinkedListNode.add(0, "Newly added item");
  LinkedListNode.remove(2);*/
  System.out.println("Final Content: " +LinkedListNode);
  RemoveDups m = new RemoveDups();
  System.out.println("Final Content: " +m.deleteDups(LinkedListNode));

  }

  void deleteDups(LinkedListNode n){
      HashSet<Integer> set = new HashSet<Integer>();
      LinkedListNode previous = null;
      while(n != null){
          if(set.contains(n.data)){
              previous.next = n.next;
          }else{
              set.add(n.data);
              previous = n;
          }
          n = n.next;
      }
  }
}
