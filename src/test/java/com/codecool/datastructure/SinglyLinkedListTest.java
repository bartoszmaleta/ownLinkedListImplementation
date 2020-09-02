package com.codecool.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SinglyLinkedListTest {

    @Test
    void testInsert1() {
        SinglyLinkedList ll = new SinglyLinkedList();

        ll.insert(0, 123);

        assertEquals(123, ll.access(0));
    }

    @Test
    void testInsert2() {
        SinglyLinkedList ll = new SinglyLinkedList();

        ll.insert(0, 123);
        ll.insert(1, 234);
        ll.insert(2, 345);

        assertEquals(123, ll.access(0));
        assertEquals(234, ll.access(1));
        assertEquals(345, ll.access(2));
    }

    @Test
    void testInsert3() {
        SinglyLinkedList ll = new SinglyLinkedList();

        ll.insert(0, 123);
        ll.insert(0, 234);
        ll.insert(0, 345);

        assertEquals(345, ll.access(0));
        assertEquals(234, ll.access(1));
        assertEquals(123, ll.access(2));
    }

    @Test
    void testInsert4() {
        SinglyLinkedList ll = new SinglyLinkedList();

        ll.insert(0, 123);
        ll.insert(0, 234);
        ll.insert(0, 345);
        ll.insert(1, 456);

        assertEquals(345, ll.access(0));
        assertEquals(456, ll.access(1));
        assertEquals(234, ll.access(2));
        assertEquals(123, ll.access(3));
    }

    @Test
    void testDelete1() {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insert(0, 123);
        ll.insert(1, 234);
        ll.insert(2, 345);

        ll.delete(0);

        assertEquals(234, ll.access(0));
        assertEquals(345, ll.access(1));
    }

    @Test
    void testDelete2() {
        // given
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insert(0, 123);
        ll.insert(1, 234);
        ll.insert(2, 345);
        ll.insert(3, 456);
        ll.insert(4, 567);
        ll.insert(5, 678);

        // when
        ll.delete(2);

        // then
        assertEquals(0, ll.search(123));
        assertEquals(1, ll.search(234));
        assertEquals(2, ll.search(456));
        assertEquals(3, ll.search(567));
        assertEquals(4, ll.search(678));

        // when
        ll.delete(3);

        assertEquals(0, ll.search(123));
        assertEquals(1, ll.search(234));
        assertEquals(2, ll.search(456));
        assertEquals(3, ll.search(678));
    }

    @Test
    void testSearch() {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insert(0, 123);
        ll.insert(1, 234);
        ll.insert(2, 345);
        ll.insert(3, 456);
        ll.insert(4, 567);
        ll.insert(5, 678);

        assertEquals(0, ll.search(123));
        assertEquals(3, ll.search(456));
        assertEquals(5, ll.search(678));
    }
}
