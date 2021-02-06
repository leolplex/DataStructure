package com.data.structures.lists.doublylinked;

public class Node {
    private Node next;
    private Node previous;

    private String info;

    public Node(String info, Node previous, Node next) {
        this.next = next;
        this.previous = previous;
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
