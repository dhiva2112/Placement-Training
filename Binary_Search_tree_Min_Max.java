class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTreeNode{
    TreeNode root;
    public BinaryTreeNode(int data){
        root=new TreeNode(data);
    }
    public void insert(int data){
        root=insertNode(root, data);
    }
    public TreeNode insertNode(TreeNode root,int data){
        if(root==null){
            return new TreeNode(data);
        }
        if(data<root.data){
            root.left=insertNode(root.left,data);
        }
		else if(data>root.data){
            root.right=insertNode(root.right, data);
        }
        return root;
    }
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void searchNode(TreeNode root,int data){
        if(root==null){
            System.out.println("Element "+data+" not found");
            return;
        }
        if(data==root.data){
            System.out.println("Element "+data+" found");
            return;
        }
		else if(data<root.data){
            searchNode(root.left,data);
        }
		else{
            searchNode(root.right,data);
        }
    }
    public int findMinimum(TreeNode root){
        if(root==null){
            System.out.println("No tree exists");
            return -1;
        }
		else if(root.left==null){
            return root.data;
        }
        return findMinimum(root.left);
    }
    public int findMaximum(TreeNode root){
        if(root==null){
            System.out.println("No tree exists");
            return -1;
        }
		else if(root.right==null){
            return root.data;
        }
        return findMaximum(root.right);
    }
}
public class Binary_Search_tree_Min_Max {
    public static void main(String[] args){
        BinaryTreeNode bst = new BinaryTreeNode(50);
        bst.insert(30);
        bst.insert(10);
        bst.insert(60);
        bst.insert(55);
        System.out.print("In-order Traversal:");
        bst.inOrder(bst.root);
        System.out.println();
        System.out.println("Min: "+bst.findMinimum(bst.root));
        System.out.println("Max: "+bst.findMaximum(bst.root));
		bst.searchNode(bst.root, 60);
    }
}