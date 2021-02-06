package com.data.structures;

import com.data.structures.lists.simplylinked.List;

public class DataStructure {
    public static void main(String[] args) {
        System.out.println("Running!!");

        List list = new List();
        list.InsertToStart("a");
        list.InsertToEnd("b");
        list.InsertToEnd("c");
        list.InsertToEnd("d");
        list.InsertToEnd("e");
        list.InsertToEnd("f");
        list.InsertToEnd("g");
        list.InsertToStart("z");
        list.toList();
        System.out.println();
        list.DeleteStart();
        list.toList();

        System.out.println();
        System.out.println("=================");
        System.out.println(list.ExtractStart());
        System.out.println();
        list.toList();

    }
}
