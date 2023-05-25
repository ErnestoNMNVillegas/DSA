package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 7
            Tail: 7
            Length: 1

            Doubly Linked List:
            7

        */

//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(4);
//
//        System.out.println("LL before reverse():");
//        myLinkedList.printList();
//
//        myLinkedList.reverse();
//
//        System.out.println("\nLL after reverse():");
//        myLinkedList.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            LL before reverse():
            1
            2
            3
            4

            LL after reverse():
            4
            3
            2
            1

        */


    }
}
