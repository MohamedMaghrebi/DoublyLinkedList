// By Mohamed
package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertDLL(1, 0);
        doublyLinkedList.insertDLL(2, 1);
        doublyLinkedList.insertDLL(3, 2);

        System.out.println("Traverse in forward direction:");
        doublyLinkedList.traverseDLL();

        System.out.println("Traverse in reverse direction:");
        doublyLinkedList.reverseTraverseDLL();

        int searchValue = 2;
        System.out.println("Search for value " + searchValue + ": " + doublyLinkedList.searchDLL(searchValue));

        doublyLinkedList.deleteNodeDLL(1);
        System.out.println("List after deleting node at position 1:");
        doublyLinkedList.traverseDLL();

        doublyLinkedList.deleteDLL();
        System.out.println("List after deleting entire DLL:");
        doublyLinkedList.traverseDLL();
    }
}