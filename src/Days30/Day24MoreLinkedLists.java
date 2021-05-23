package Days30;

import java.util.Scanner;

public class Day24MoreLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        Node2 head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

	}

	public static Node2 removeDuplicates(Node2 head) {
	      //Write your code here
	        Node2 cur = head;
	        if(head == null) return head;
	        
	        while(head.next != null)
	        {
	            if(head.data == head.next.data)
	            {
	                head.next = head.next.next;
	            }else{
	             head = head.next;
	            }           
	        }
	        return cur;
	    }

		 public static  Node2 insert(Node2 head,int data)
	     {
	        Node2 p=new Node2(data);			
	        if(head==null)
	            head=p;
	        else if(head.next==null)
	            head.next=p;
	        else
	        {
	            Node2 start=head;
	            while(start.next!=null)
	                start=start.next;
	            start.next=p;

	        }
	        return head;
	    }
	    public static void display(Node2 head)
	        {
	              Node2 start=head;
	              while(start!=null)
	              {
	                  System.out.print(start.data+" ");
	                  start=start.next;
	              }
	        }
	    
}


class Node2{
	int data;
	Node2 next;
	Node2(int d){
        data=d;
        next=null;
    }
	
}