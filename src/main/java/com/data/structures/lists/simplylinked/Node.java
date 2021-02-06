package com.data.structures.lists.simplylinked;

public class Node {

    private String info;
    Node next;

    public Node(String value, Node node) {
        info = value;
        next = node;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
