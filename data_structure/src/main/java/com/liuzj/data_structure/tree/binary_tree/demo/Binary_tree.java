package com.liuzj.data_structure.tree.binary_tree.demo;

import com.liuzj.data_structure.tree.binary_tree.node.Binary_tree_node;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树
 *
 * @author liuzj
 * @date 2019-03-06
 */
public class Binary_tree {

    private Binary_tree_node root;

    /**
     * 插入数据
     *
     * @param data
     */
    public void put(int data) {
        Binary_tree_node newNode = new Binary_tree_node(data, null, null);
        if (root == null) {
            root = newNode;
        } else {
            Binary_tree_node pointer = root;
            while (true) {
                if (newNode.getData() >= pointer.getData()) {
                    if (pointer.getRightNode() == null) {
                        pointer.setRightNode(newNode);
                        return;
                    }
                    pointer = pointer.getRightNode();
                } else {
                    if (pointer.getLeftNode() == null) {
                        pointer.setLeftNode(newNode);
                        return;
                    }
                    pointer = pointer.getLeftNode();
                }
            }

        }
    }

    /**
     * 搜索
     *
     * @param data 待搜索的值
     * @return Integer
     */
    public Integer get(int data){
        Binary_tree_node pointer = root;
        Integer count = 1;
        while (true) {
            System.out.println("寻找了：" + count + "次");
            if (data >= pointer.getData()) {
                if (pointer.getData() == data) {
                    return pointer.getData();
                }
                pointer = pointer.getRightNode();
            } else {
                if (pointer.getData() == data) {
                    return pointer.getData();
                }
                pointer = pointer.getLeftNode();
            }
            if (pointer == null) {
                return null;
            }
            count++;
        }
    }

    /**
     * 寻找最大值（右子树遍历）；寻找最小值同理
     *
     * @return Integer
     */
    public Integer getMax(){
        Binary_tree_node pointer = root;
        Integer count = 1;
        int max = 0;
        while (true) {
            System.out.println("寻找了：" + count + "次");
            if (max < pointer.getData()) {
                max = pointer.getData();
                pointer = pointer.getRightNode();
            }
            if (pointer == null) {
                return max;
            }
            count++;
        }
    }

    /**
     * 判断其是否是完全二叉树；是否满足以下两个条件：
     * 1.任何一个结点如果右孩子不为空，左孩子却是空，则一定不是完全二叉树
     * 2.当一个结点出现右孩子为空时候，判断该结点的层次遍历后继结点是否为叶子节点，如果全部都是叶子节点，则是完全二叉树，
     * 如果存在任何一个结点不是叶节点，则一定不是完全二叉树。
     *
     * @return boolean
     */
    public boolean isCompleteTree(){
        List<Binary_tree_node> nodeList = firstSearch();
        for(Binary_tree_node node: nodeList) {
            if (node.getLeftNode() == null && node.getRightNode() != null) {
                return false;
            }
            if (node.getRightNode() == null
                    && node.getLeftNode() != null
                    && (node.getLeftNode().getLeftNode() != null || node.getRightNode() != null)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 先序遍历
     */
    public List<Binary_tree_node> firstSearch() {
        List<Binary_tree_node> result = new LinkedList<>();
        Stack<Binary_tree_node> stack = new Stack<>();
        Binary_tree_node node = root;
        while (node != null || stack.size() > 0) {
            if (node != null) {
                result.add(node);
                stack.push(node);
                node = node.getLeftNode();
            } else {
                node = stack.pop();
                node = node.getRightNode();
            }
        }
        return result;
    }

    /**
     * 中序遍历（利用stack做辅助）
     */
    public void centerSearch(){
        Stack<Binary_tree_node> stack = new Stack<>();
        Binary_tree_node node = root;
        while (node != null || stack.size() > 0) {
            if (node != null) {
                stack.push(node);
                node = node.getLeftNode();
            } else {
                node = stack.pop();
                System.out.print(node.getData() + "\t");
                node = node.getRightNode();
            }
        }
    }

     /**
     * 后序递归遍历
     */
    public void lastRecurveSearch(Binary_tree_node root){
        if(root != null){
            lastRecurveSearch(root.getLeftNode());
            lastRecurveSearch(root.getRightNode());
            System.out.print(root.getData() + "\t");
        }
    }

    /**
     * 前序递归遍历
     */
    public void firstRecurveSearch(Binary_tree_node root){
        if(root != null){
            System.out.print(root.getData() + "\t");
            firstRecurveSearch(root.getLeftNode());
            firstRecurveSearch(root.getRightNode());
        }
    }

    /**
     * 中序递归遍历
     */
    public void centerRecurveSearch(Binary_tree_node root){
        if(root != null){
            firstRecurveSearch(root.getLeftNode());
            System.out.print(root.getData() + "\t");
            firstRecurveSearch(root.getRightNode());
        }
    }


    public static void main(String[] args) {
        Binary_tree binary_tree = new Binary_tree();
        binary_tree.put(2);
        binary_tree.put(8);
        binary_tree.put(1);
        binary_tree.put(0);
        binary_tree.put(5);
        binary_tree.lastRecurveSearch(binary_tree.root);
        System.out.println();
        binary_tree.firstRecurveSearch(binary_tree.root);
        System.out.println();
        binary_tree.centerRecurveSearch(binary_tree.root);
        System.out.println();
        System.out.println(binary_tree.isCompleteTree());
    }
}
