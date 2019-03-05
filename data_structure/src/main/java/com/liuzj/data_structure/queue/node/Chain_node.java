package com.liuzj.data_structure.queue.node;

/**
 * 链式队列（LinkedList原理）
 * @author liuzj
 * @param <E>
 */
public class Chain_node<E> {
    E item;
    Chain_node<E> next;
    Chain_node<E> prev;

    public Chain_node(Chain_node<E> prev, E element, Chain_node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public Chain_node<E> getNext() {
        return next;
    }

    public void setNext(Chain_node<E> next) {
        this.next = next;
    }

    public Chain_node<E> getPrev() {
        return prev;
    }

    public void setPrev(Chain_node<E> prev) {
        this.prev = prev;
    }
}
