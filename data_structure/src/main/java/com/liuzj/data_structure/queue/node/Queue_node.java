package com.liuzj.data_structure.queue.node;

/**
 * 队列数据结构
 *
 * @author liuzj
 * @date 2019-03-05
 */
public class Queue_node {

    /**
     * 数据存放位
     */
    private Object[] data;

    /**
     * 前驱
     */
    private int head;

    /**
     * 后继
     */
    private int tail;

    /**
     * 初始化队列长度
     * @param init_size 长度
     */
    public Queue_node(int init_size) {
        this.data = new Object[init_size];
    }

    public Object[] getData() {
        return data;
    }

    public void setData(Object[] data) {
        this.data = data;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }
}
