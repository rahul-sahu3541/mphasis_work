package com.mphasis.main.cui;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create and initialize linked list.
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(-8);
        linkedList.add(20);
        linkedList.add(-20);
        linkedList.add(8);

        // Create a reverse order comparator.
        Comparator<Integer> r = Collections.reverseOrder();

        // Sort list by using the comparator.
        Collections.sort(linkedList, r);

        System.out.print("List sorted in reverse: ");
        for(int i : linkedList)
            System.out.print(i+ " ");

        System.out.println();

        // Shuffle list.
        Collections.shuffle(linkedList);

        // Display randomized list.
        System.out.print("List shuffled: ");
        for(int i : linkedList)
            System.out.print(i + " ");

        System.out.println();

        System.out.println("Minimum: " + Collections.min(linkedList));
        System.out.println("Maximum: " + Collections.max(linkedList));
    }
}
