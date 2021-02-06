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
            Node newNode = new Node(info, end, null);
            end.setNext(newNode);
            end = newNode;
        }
    }

    public String extractStart() {
        String info = start.getInfo();
        start = start.getNext();
        if (start != null)
            start.setPrevious(null);
        else
            end = null;
        return info;
    }

    public String extractEnd() {
        String info = end.getInfo();
        end = end.getPrevious();
        if (end != null)
            end.setNext(null);
        else
            start = null;
        return info;
    }

    public void showAhead() {
        Node temp = start;
        while (temp != null) {
            System.out.println(temp.getInfo());
            temp = temp.getNext();
        }
    }

    public void showBehind() {
        Node temp = end;
        while (temp != null) {
            System.out.println(temp.getInfo());
            temp = temp.getPrevious();
        }
    }

    public boolean search(String info) {
        Node temp = start;
        while (temp != null) {
            if (temp.getInfo().equals(info)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

}
