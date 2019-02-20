package bean;

/**
 * @author Lee
 * @create 2019/2/20 14:23
 */
public class TreeNode {
    private  int value;
    private TreeNode treeLeftNode;
    private TreeNode treeRightNode;

    public TreeNode() {
    }

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getTreeLeftNode() {
        return treeLeftNode;
    }

    public void setTreeLeftNode(TreeNode treeLeftNode) {
        this.treeLeftNode = treeLeftNode;
    }

    public TreeNode getTreeRightNode() {
        return treeRightNode;
    }

    public void setTreeRightNode(TreeNode treeRightNode) {
        this.treeRightNode = treeRightNode;
    }


}
