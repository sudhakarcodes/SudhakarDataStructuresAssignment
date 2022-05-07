package BSTtoSkewed;

class Node
{
 int val;
 Node left, right;
 
 // method to allocate a new node with the given data and NULL left and right pointers.
 
 Node(int item)
 {
     val = item;
     left = right = null;
 }
}

class convertBSTtoSkewed

{
 public static Node node;
 static Node prevNode = null;
 static Node headNode = null;

 // method to convert the BST into a skewed tree in ascending order

 static void BSTtoSkewed(Node root,
                               int order)
 {
    
     // Base Case
     if(root == null)
     {
         return;
     }
    
     if(order > 0)
     	{
    	 BSTtoSkewed(root.right, order);
     }
     else
     {
         BSTtoSkewed(root.left, order);
     }

     Node rightNode = root.right;
     Node leftNode = root.left;
    
     // Condition to check if the root Node of the skewed tree is not defined
     if(headNode == null)
     {
         headNode = root;
         root.left = null;
         prevNode = root;
     }
     else
     {
         prevNode.right = root;
         root.left = null;
         prevNode = root;
     }
    
     // Recursion for subtree on the basis of asc or des order
     
     if (order > 0)
     {
         BSTtoSkewed(leftNode, order);
     }
     
     else
     {
         BSTtoSkewed(rightNode, order);
     }
 }

 // Method to traverse the right skewed tree using recursion
 
 static void traverseRightSkewed(Node root)
 {
     if(root == null)
     {
         return;
     }
     System.out.print(root.val + " ");
     traverseRightSkewed(root.right);       
 }

 // Main method
 
 public static void main (String[] args)
 {
     convertBSTtoSkewed tree = new convertBSTtoSkewed();
     tree.node = new Node(50);
     tree.node.left = new Node(30);
     tree.node.right = new Node(60);
     tree.node.left.left = new Node(10);
     tree.node.right.left = new Node(55);
    
     // For ascending order - 0
     // For descending order - 1
     int order = 0;
     BSTtoSkewed(node, order);
     traverseRightSkewed(headNode);
 }
}
