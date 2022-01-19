//
// Example 1: Defining a Linked List class
//

public class LinkedList<T> {
    // We need a node class

    class Node<T> {
        private T _data;
        public Node<T> next;

        Node(T data) {
            this._data = data;
            this.next = null;
        }

        T getData() {
            return this._data;
        }

        void setData(T data) {
            this._data = data;
        }
    }

    // Track the head of the list
    public Node head;

    LinkedList() {
        this.head = null;
    }

    // Add data to the head of the list
    void addHead(T data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    // Add data to the tail of the list
    void addTail(T data) {
        Node newNode = new Node(data);

        // Find the last item in the list
        Node currentNode = this.head;

        while (currentNode.next != null)
            currentNode = currentNode.next;

        // Link the new node here
        currentNode.next = newNode;
    }
}