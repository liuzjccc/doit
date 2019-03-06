package com.liuzj.data_structure.queue.demo;

import com.liuzj.data_structure.queue.node.Chain_node;

import java.util.*;

/**
 * 链式队列（LinkedList原理）
 * @author liuzj
 * @param <E> 存入的数据类型
 */
public class Chain_queue<E> {

    private Chain_node<E> last;

    private Chain_node<E> pre;

    /**
     * 从头部插入数据
     *
     * @param data 数据
     */
    public void putFromTail(E data){
        Chain_node<E> l = last;
        Chain_node<E> newNode = new Chain_node<>(l,data,null);
        if (pre == null) {
            pre = newNode;
        }
        if (last != null) {
            last.setNext(newNode);
        }
        last = newNode;
    }

    /**
     * 从尾部插入数据
     *
     * @param data 数据
     */
    public void putFromHead(E data){
        Chain_node<E> p = pre;
        Chain_node<E> newNode = new Chain_node<>(null,data,p);
        if (last == null) {
            last = newNode;
        }
        if (pre != null) {
            pre.setPrev(newNode);
        }
        pre = newNode;
    }

    /**
     * 删除节点
     *
     * @param data 待删除的节点内容
     */
    public void remove(E data){
        if (data == null) {
            for (Chain_node<E> x = pre; x != null; x = x.getNext()) {
                if (x.getItem() == null) {
                    reArrange(x);
                }
            }
        } else {
            for (Chain_node<E> x = pre; x != null; x = x.getNext()) {
                if (data.equals(x.getItem())) {
                    reArrange(x);
                }
            }
        }
    }

    /**
     * 根据先进先出的原则获取一个节点内容
     *
     * @return 节点内容
     */
    public E getFromLeft(){
        return pre.getItem();
    }

    /**
     * 根据后进先出的原则获取一个节点内容
     *
     * @return 节点内容
     */
    public E getFromRight(){
        return last.getItem();
    }

    /**
     * 重新整理链表
     *
     * @param x 删除的节点
     */
    private void reArrange(Chain_node<E> x){
        Chain_node<E> xpre = x.getPrev();
        Chain_node<E> xlast = x.getNext();
        if (xpre == null && xlast == null) {
            pre = null;
            last = null;
        }
        if (xpre == null && xlast != null) {
            pre = xlast;
            xlast.setPrev(null);
        }
        if (xpre != null && xlast == null) {
            last = xpre;
            xpre.setNext(null);
        }
        if (xpre != null && xlast != null) {
            xpre.setNext(xlast);
            xlast.setPrev(xpre);
        }
    }

    public static void main(String[] args) {
        Chain_queue<String> chain_queue = new Chain_queue<>();
        chain_queue.putFromHead("A");
        chain_queue.putFromTail("B");
        chain_queue.putFromHead("C");
        chain_queue.putFromHead("C");
        chain_queue.remove("C");
        System.out.println(chain_queue.getFromLeft());
        System.out.println(chain_queue.getFromRight());
        Stack stack = new Stack();
    }
}
