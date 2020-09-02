package com.codecool;

import com.codecool.datastructure.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        String cmd = args[1];

        SinglyLinkedList ll = new SinglyLinkedList();

        System.out.println("Building the linked list ... this may take a while :)");
        for (int i = 0; i < n; i++) {
            ll.insert(i, i);
        }

        long start = 0, end = 0;
        if ("access".equals(cmd)) {
            int i = Integer.valueOf(args[2]);

            start = System.currentTimeMillis();
            ll.access(i);
            end = System.currentTimeMillis();

        } else if ("search".equals(cmd)) {
            int x = Integer.valueOf(args[2]);

            start = System.currentTimeMillis();
            ll.search(x);
            end = System.currentTimeMillis();

        } else if ("insert".equals(cmd)) {
            int i = Integer.valueOf(args[2]);
            int x = Integer.valueOf(args[3]);

            start = System.currentTimeMillis();
            ll.insert(i, x);
            end = System.currentTimeMillis();

        } else if ("delete".equals(cmd)) {
            int i = Integer.valueOf(args[2]);

            start = System.currentTimeMillis();
            ll.delete(i);
            end = System.currentTimeMillis();

        } else {
            System.exit(1);
        }

        System.out.format("%s took: %sms\n", cmd, end - start);
    }
}
