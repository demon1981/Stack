

public class Stack <T>{

    private Node<T> head;


    public Stack() {
        head = null;
    }

    public Stack(T value) {
        this.head = new Node<T>(value);
    }

    public void push(T value) {

        Node<T> newNode = new Node<T>(value);
        newNode.prevNode = this.head;
        this.head = newNode;
    }

    public T pop() {

        if (this.head == null){
            return null;
        }

        Node<T> headNode = this.head;
        this.head = headNode.prevNode;
        return headNode.value;
    }


    private static class Node <T>{

        private T value;
        private Node<T> prevNode;

        private Node(T value) {
            this.value = value;
        }
    }



}
