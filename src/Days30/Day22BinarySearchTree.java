package Days30;

import java.util.Scanner;

public class Day22BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
	}

	public static int getHeight(Node root){
		
	   if(root == null)
	   {
		   return -1; //Here we have return -1 to present maxHeight 0;
	   }else
       {
           int lHeight = getHeight(root.left);
           int rHeight = getHeight(root.right);
 

           if (lHeight > rHeight)
               return (lHeight + 1);
            else
               return (rHeight + 1);
       }
	}

	    public static Node insert(Node root,int data)
	    {
	        if(root==null){
	            return new Node(data);
	        }
	        else{
	            Node cur;
	            if(data<=root.data){
	                cur=insert(root.left,data);
	                root.left=cur;
	            }
	            else{
	                cur=insert(root.right,data);
	                root.right=cur;
	            }
	            return root;
	        }
	    }
}

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}