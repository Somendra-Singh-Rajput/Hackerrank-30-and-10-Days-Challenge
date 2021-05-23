package Days30;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23BSTLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node1 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
            }
        levelOrder(root);
    }	
	
	public static Node1 insert(Node1 root,int data){
    if(root==null){
        return new Node1(data);
    }
    else{
        Node1 cur;
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
    static void levelOrder(Node1 root){
        //Write your code here
    	
    	 Queue<Node1> queue=new LinkedList<Node1>();
    	 
    	 queue.add(root);
    	 
    	 while(!queue.isEmpty())
    	 {
    		 Node1 tempNode=queue.poll();
    	     System.out.printf("%d ",tempNode.data);
    	      if(tempNode.left!=null)
    	         queue.add(tempNode.left);
    	      if(tempNode.right!=null)
    	        queue.add(tempNode.right);
         }
  }
}

class Node1{
    Node1 left,right;
    int data;
    Node1(int data){
        this.data=data;
        left=right=null;
    }
}

