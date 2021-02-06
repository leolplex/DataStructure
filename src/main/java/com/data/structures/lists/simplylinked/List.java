package com.data.structures.lists.simplylinked;

public class List {
    Node start;
    Node end;

    public List() {
        start = null;
        end = null;
    }

    public void InsertToStart(String info) {
        Node newNode = new Node(info, start);
        start = newNode;
        if (end == null)
            end = start;
    }

    public void InsertToEnd(String info) {
        Node newNode = new Node(info, null);

        if (start == null) {
            end = newNode;
            start = end;
        } else {
            end.setNext(newNode);
            end = newNode;
        }
    }

    public void DeleteStart() {
        start = start.next;
    }

    public String ExtractStart() {
        String info = start.getInfo();
        start = start.getNext();
        if (start == null) {
            end = null;
        }
        return info;
    }

    public void toList() {
        Node temp = start;
        while (temp != null) {
            System.out.println(temp.getInfo());
            temp = temp.next;

        }
    }
}
