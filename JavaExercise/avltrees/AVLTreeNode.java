/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avltrees;

/**
 *
 * @author isaackomaiya
 */
  /** AVLTreeNode is TreeNode plus height */
  public class AVLTreeNode<E extends Comparable<E>> extends
    BST.TreeNode<E> {
   protected int height = 0; // New data field

   public AVLTreeNode(E o) {
    super(o);
   }
  }