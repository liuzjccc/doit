package com.liuzj.data_structure.queue.demo;

import com.liuzj.data_structure.queue.node.Queue_node;

/**
 * 顺序队列（ArrayList实现原理）
 *
 * @author liuzj
 * @date 2019-03-05
 */
public class Sequence_queue {

    private Queue_node queue_node;

    /**
     * 队列初始化
     */
    public Sequence_queue(int queue_size) {
        this.queue_node = new Queue_node(queue_size);
    }

    /**
     * 入队
     */
    public synchronized void put(Object data){
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        if (data != null) {
            this.queue_node.getData()[this.queue_node.getHead()] = data;
            this.queue_node.setHead(this.queue_node.getHead() + 1);
            System.out.println(Thread.currentThread().getName() + "put: " + data);
        } else {
            System.out.println("不允许存Null值");
        }
    }

    /**
     * 判满
     */
    public boolean isFull(){
        return this.queue_node.getHead() == this.queue_node.getData().length - 1;
    }

    /**
     * 判空
     */
    public boolean isEmpty(){
        return this.queue_node.getHead() == 0;
    }

    /**
     * 出队
     */
    public synchronized Object out(){
        if (isEmpty()) {
            return "队列为空";
        }
        Object out_value = this.queue_node.getData()[this.queue_node.getTail()];
        System.arraycopy(this.queue_node.getData(),this.queue_node.getTail() + 1,this.queue_node.getData(),0,this.queue_node.getHead());
        return out_value;

    }

}
