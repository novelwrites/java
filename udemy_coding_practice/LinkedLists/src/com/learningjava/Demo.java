package com.learningjava;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Colorado Springs");
        placesToVisit.add("Washington D.C.");
        placesToVisit.add("Israel");
        placesToVisit.add("Rwanda");
        placesToVisit.add("Germany");
        placesToVisit.add("Cambodia");

        printList(placesToVisit);

        placesToVisit.add(1, "Iran");

        printList(placesToVisit);

        placesToVisit.remove(1);
        placesToVisit.add (3, "India");

        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=======================================");

    }
}
