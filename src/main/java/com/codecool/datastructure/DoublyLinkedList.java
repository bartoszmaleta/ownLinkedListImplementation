package com.codecool.datastructure;

public class DoublyLinkedList {

    private class Link {

        private int value;
        private Link next;
        private Link previous;
        private int index;

        Link(int value) {
            this.value = value;
        }

        public Link getPrevious() {
            return previous;
        }

        public Link setPrevious(Link previous) {
            this.previous = previous;
            return this;
        }

        public Link setValue(int value) {
            this.value = value;
            return this;
        }

        public int getIndex() {
            return index;
        }

        public Link setIndex(int index) {
            this.index = index;
            return this;
        }

        public int getValue() {
            return value;
        }

        public Link getNext() {
            return next;
        }

        public Link setNext(Link next) {
            this.next = next;
            return this;
        }
    }

    private Link head;
    private Link tail;
    private int counter;

    public DoublyLinkedList() {
    }

    // Returns the number at 'index'.
    public int access(int index) {
        if (index == 0) return this.head.getValue();
        if (head == null) return -1;
        if (index > counter) {
            throw new IndexOutOfBoundsException("Too big index");
        }

        Link current = this.head;
        int currentIndex = 0;

        while (currentIndex != index) {
            currentIndex++;
            current = current.getNext();
        }
        return current.getValue();
    }

    // Returns the index of 'number' if it's in the array, otherwise -1;
    public int search(int number) {
        if (number == 0) return 0;
        if (head == null) return -1;

        Link current = this.head;
        int currentIndex = 0;
        while (current != null) {
            if (current.getValue() == number) {
                return currentIndex;
            }
            currentIndex++;
            current = current.getNext();
        }
        return -1;
    }

    // Inserts 'number' at 'index' into the array shifting elements if necessary.
    //
    // e.g. the result of inserting 42 at index 3 into [0, 1, 2, 3, 4] is [0, 1, 2, 42, 3, 4]
    public void insert(int index, int number) {
        Link newNode = new Link(number);
//        if (index > counter) {
//            throw new IndexOutOfBoundsException("Too big number");
//        }
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        if (index == 0) {
            newNode.setNext(this.head);
            this.head.setPrevious(newNode);
            this.head = newNode;
        } else if (index == counter) {
            newNode.setPrevious(this.tail);
            this.tail.setNext(newNode);
            this.tail = newNode;
        } else {
            Link current = this.head;

            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            newNode.setNext(current);
            newNode.setPrevious(current.getPrevious());
            current.getPrevious().setNext(newNode);
            current.setPrevious(newNode);
        }
        this.counter++;
    }

    public void addAtTail(int number) {
        Link newNode = new Link(number);

        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        this.tail.setNext(newNode);
        newNode.setIndex(this.tail.getIndex() + 1);
    }

    // Deletes the element at 'index' from the array.
    //
    //  e.g. the result of deleting index 2 from [0, 1, 2, 3, 4] is [0, 1, 3, 4]
    public void delete(int index) {
        if (index == 0) {
            if (head == null) {
                throw new IndexOutOfBoundsException();
            } else {
                head = head.getNext();
            }
            return;
        }
        Link elementBeforeIndex = head;
        while (index - 1 > 0) {
            elementBeforeIndex = elementBeforeIndex.getNext();
            index--;
            if (elementBeforeIndex == null) {
                throw new IndexOutOfBoundsException();
            }
        }
        Link elementAtIndex = elementBeforeIndex.getNext();
        if (elementAtIndex == null) {
            throw new IndexOutOfBoundsException();
        }
        elementBeforeIndex.setNext(elementAtIndex.getNext());
    }
}
