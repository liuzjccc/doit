package com.liuzj.data_structure.tree.binary_tree.node;

/**
 * 二叉树数据结构（左边的小于其直系父节点，右边的大于或者等于其直系父节点）
 *
 * @author liuzj
 * @date 2019-03-06
 */
public class Binary_tree_node {

    /**
     * 数据位
     */
    private int data;

    /**
     * 左子节点
     */
    private Binary_tree_node leftNode;

    /**
     * 右子节点
     */
    private Binary_tree_node rightNode;

    public Binary_tree_node(int data, Binary_tree_node leftNode, Binary_tree_node rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Binary_tree_node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Binary_tree_node leftNode) {
        this.leftNode = leftNode;
    }

    public Binary_tree_node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Binary_tree_node rightNode) {
        this.rightNode = rightNode;
    }
}
