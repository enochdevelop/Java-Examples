/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybts;

/**
 *
 * @author enoch
 */
public class BTS<E extends Comparable<E>> extends AbstractTree<E> {

   
    

    protected TreeNode<E> root;
    protected int size = 0;

    //create a default binary tree
    public BTS() {

    }

    public boolean search(E e) {
        TreeNode<E> current = root; //strat from root

        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                current = current.right;
            } else {
                return true;

            }
        }
        return false;
    }

    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);  //create a new root
        } else {
            //locate the parent node
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;   //duplicate node not inserted
                }
            }

            //create the new node and attach it to the parent node
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true; //element inserted successfully
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    /* Inorder traversal form the root
     */
    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) {
            return;

        }
        inorder(root.left);
        System.out.print(root.element + " ");
    }

    //Postorder traversal from a subtree
    @Override
    public void postorder() {
        postorder(root);
    }

    protected void postorder(TreeNode<E> root) {
        if (root == null) {
            return;

        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }

    //Preorder traversal from a subtree
    @Override
    public void preorder() {
        postorder(root);
    }

    protected void preorder(TreeNode<E> root) {
        if (root == null) {
            return;

        }
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }
      // Returns the number of leaf nodes //
     public int getNumberOfLeaves(TreeNode<E> root) {
    if (root == null)
      return 0;
    else if (root.left == null)
      return 1;
    else if ( root.right == null)
        return 1;
    else
      return getNumberOfLeaves(root.left) + getNumberOfLeaves(root.right);
  }
    
    //returns the size
    @Override
    public int getSize() {
        return size;
    }

    //returns the root
    public TreeNode<E> getRoot() {
        return root;
    }
    
    //REmove all elements from the tree
    public void clear() {
        root = null;
        size = 0;
    }
    
    public int height() {
        return height(root);
    }
    
    private int height(TreeNode<E> root) {
        if (root == null) {
            return 0;
        } else {
            return 1+ Math.max(height(root.left), height(root.right));
        }
    }
}
