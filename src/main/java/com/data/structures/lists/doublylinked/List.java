package com.data.structures.lists.doublylinked;

public class List {

    private Node start;
    private Node end;

    public List() {
        start = null;
        end = null;
    }

    public void insertToStart(String info) {
        if (start == null) {
            start = new Node(info, null, null);
            end = start;
        } else {
            Node newNode = new Node(info, null, start);
            start.setPrevious(newNode);
            start = newNode;
        }
    }

    public void insertToEnd(String info) {
        if (start == null) {
            end = new Node(info, null, null);
            start = end;
        } else {
            Node newNode = new Node(info, null, start);
            end.setPrevious(newNode);
            end = newNode;
        }
    }
}
