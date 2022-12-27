package linkedLists;

import java.util.LinkedList;

public class LinkedLists {
    public static void linkedLists(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.addLast("D");
        list.addFirst("E");
        list.add(3,"F");

        System.out.println(list);
    }
}
