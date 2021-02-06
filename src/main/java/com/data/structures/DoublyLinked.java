package com.data.structures;

import com.data.structures.lists.doublylinked.List;

public class DoublyLinked {

    public static void main(String[] args) {
        System.out.println("Running!!");
        DoublyLinkedPerform();
    }

    public static void DoublyLinkedPerform() {
        List list = new List();
        list.insertToStart("a");
        list.insertToEnd("b");
        list.insertToEnd("c");
        list.showAhead();
        System.out.println("============");
        System.out.println("Eliminating " + list.extractStart());
        list.showAhead();
        System.out.println("============");
        System.out.println("Eliminating " + list.extractEnd());
        list.showAhead();
        System.out.println("============");
        System.out.println(list.search("a"));


    }
}
