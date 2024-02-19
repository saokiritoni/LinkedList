package LinkedList;

import java.util.EmptyStackException;

class MyStack<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T element = list.get(list.size() - 1);
        list.delete(list.size() - 1);
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}

