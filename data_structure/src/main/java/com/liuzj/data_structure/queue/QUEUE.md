#### 顺序队列和链式队列（ArrayList 和 LinkedList原理）
* 除了hashTable之外的集合都可以存null
* hashMap的key和value都允许为null
* hashSet底层其实就是hashMap实现的
* hashMap就是Entry数组和链表组成：通过对key的hashCode进行hash计算出下标索引已获得存储位置
* vector也是基于数组实现的，线程安全，但是效率低，目前基本被弃用
* ArrayList其实就是数组，每次添加的时候通过size值判断插入位置，每次移除的时候会将所有数据进行移动（使用system.arrayCopy方法）以填补空位
* LinkedList是链表，数据结构由三部分组成：前驱、数据位、后继；创建的链表的时候会创建两个node指针，头指正和尾指针分别指向头节点和尾节点