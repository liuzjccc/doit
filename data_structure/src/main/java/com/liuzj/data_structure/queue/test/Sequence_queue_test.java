package com.liuzj.data_structure.queue.test;

import com.liuzj.data_structure.queue.demo.Sequence_queue;

public class Sequence_queue_test {

    public static void main(String[] args) {
        Sequence_queue sequence_queue = new Sequence_queue(5);
//        new Thread(()->{
            sequence_queue.put(1);
//        }).start();

//        new Thread(()->{
            sequence_queue.put(2);
//        }).start();

//        new Thread(()->{
            sequence_queue.put(3);
//        }).start();

        System.out.println(sequence_queue.out());
        System.out.println(sequence_queue.out());
        System.out.println(sequence_queue.out());
        System.out.println(sequence_queue.out());
    }
}
