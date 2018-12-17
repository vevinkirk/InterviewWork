public class Node {
    int cargo;
    Node next;

    public Node () {
        cargo = 0;
        next = null;
    }

    public Node (int cargo, Node next) {
        this.cargo = cargo;
        this.next = next;
    }

    public String toString () {
        return cargo + "";
    }

    public static void printList (Node list) {
        Node node = list;
        System.out.print ("{");
        while (node != null) {
            System.out.print(node+",");
            node = node.next;
        }
        System.out .print("}");
        System.out.println ();
    }
    public static void printBackward (Node list) {
        if (list == null) return;

        Node head = list;
        Node tail = list.next;

        printBackward (tail);
        System.out.print (head);
    }

    public static void main(String[] args){
      Node node1 = new Node (1, null);
      Node node2 = new Node (2, null);
      Node node3 = new Node (3, null);
      node1.next = node2;
      node2.next = node3;
      node3.next = null;
      printList (node1);
      printBackward(node1);
    }
}
