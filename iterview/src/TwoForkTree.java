import bean.TreeNode;
import bean.TreeRoot;

import java.lang.reflect.Array;

/**
 * @author Lee
 * @create 2019/2/20 14:22
 */
public class TwoForkTree {
    static int i=0;

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(35);

        treeNode1.setTreeLeftNode(treeNode2);
        treeNode2.setTreeRightNode(treeNode3);

        treeNode3.setTreeLeftNode(treeNode4);
        treeNode3.setTreeRightNode(treeNode5);
      //  showFirstTree(treeNode1);
      showMidTree(treeNode1);
      //showLasttTree(treeNode1);
        int[] array = {3,2,1,4,5};
       // int[] array = {1,2,3,4,5};
        TreeRoot treeRoot = new TreeRoot();
      for(int val:array){
          setTwoForkTree(treeRoot,val);
      }
       // showFirstTree(treeRoot.getTreeNode());


       // System.out.println(getHeighTree(treeRoot.getTreeNode()));

       // System.out.println(getMaxTree(treeRoot.getTreeNode()));
    }

    public static void showFirstTree(TreeNode treeNode){

        if(treeNode != null) {
            System.out.println(treeNode.getValue());
            showFirstTree(treeNode.getTreeLeftNode());
            showFirstTree(treeNode.getTreeRightNode());
        }

    }

    public static void showMidTree(TreeNode treeNode){

        if(treeNode != null) {
            showMidTree(treeNode.getTreeLeftNode());

            System.out.println(treeNode.getValue());

            showMidTree(treeNode.getTreeRightNode());

        }
    }

    public static void showLasttTree(TreeNode treeNode){
        if(treeNode != null) {
            showLasttTree(treeNode.getTreeLeftNode());
            showLasttTree(treeNode.getTreeRightNode());
            System.out.println(treeNode.getValue());
        }
    }



    public static void setTwoForkTree(TreeRoot treeRoot,int val){

       // System.out.println(val);
        if (treeRoot.getTreeNode() == null){
            TreeNode treeNode1 = new TreeNode(val);
            treeRoot.setTreeNode(treeNode1);
        } else {

            TreeNode tmpTreeNode = treeRoot.getTreeNode();
            while (tmpTreeNode != null) {

                if (tmpTreeNode.getValue() < val) {
                    if(tmpTreeNode.getTreeRightNode() == null){
                        TreeNode treeNode = new TreeNode(val);
                        tmpTreeNode.setTreeRightNode(treeNode);
                        return;
                    } else{
                        tmpTreeNode = tmpTreeNode.getTreeRightNode();
                    }

                } else {
                    if(tmpTreeNode.getTreeLeftNode() == null){
                        TreeNode treeNode = new TreeNode(val);
                        tmpTreeNode.setTreeLeftNode(treeNode);
                        return;
                    } else{
                        tmpTreeNode = tmpTreeNode.getTreeLeftNode();
                    }
                }
            }
        }

    }


    public static int getHeighTree(TreeNode treeNode){
        if(treeNode == null)return 0;


        int left = getHeighTree(treeNode.getTreeLeftNode());
        int right = getHeighTree(treeNode.getTreeRightNode());
        int max = left;

        if (right >max){
            max = right;
        }


        return max+1;
    }

    public static int getMaxTree(TreeNode treeNode){
        if(treeNode == null)return 0;

        int left = getMaxTree(treeNode.getTreeLeftNode());
        int right = getMaxTree(treeNode.getTreeRightNode());

        int value = treeNode.getValue();
        int max = left;
        if(right>max){
            max = right;
        }

        if(max<value){
            max = value;
        }
        return max;
    }
}
