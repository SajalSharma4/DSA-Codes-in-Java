package LinkedList.DoubleLinkedList;

import java.util.Scanner;

public class DoubleLinkedList {
    public Node start;

    Scanner input=new Scanner(System.in);
    
    DoubleLinkedList(){
        start=null;
    }

    public void display(){
        if (start==null){
            System.out.println("List is empty");
            return;
        }
        
        System.out.print("The list is : ");
        Node p=start;
        while(p!=null){
            System.out.print(p.info+" ");
            p=p.next;
        }
        System.out.println(" ");
    }

    public void InsertAtStart(int data){
        Node temp=new Node(data);
        temp.next=start;
        start.prev=temp;
        start=temp;
    }

    public void InsertInEmpty(int data){
        Node temp=new Node(data);
        start=temp;
    }

    public void InsertAtEnd(int data){
        Node temp=new Node(data);

        Node p=start;
        while(p.next!=null){
            p=p.next;
        }
        p.next=temp;
        temp.prev=p;
    }

    public void InsertAfterVal(int val, int data){
        Node temp=new Node(data);

        Node p=start;
        while(p!=null){
            if(p.info==val){
                break;
            }
            p=p.next;
        }

        if(p==null){
            System.out.println("Value "+ val +" not present in the list.");
        }
        else{
            temp.prev=p;
            temp.next=p.next;
            if(p.next!=null)
                p.next.prev=temp;                   //it should not be done when p is at last node. in that case p.next is null. 
            p.next=temp;
        }
    }

    public void InsertBeforeVal(int val, int data){
        Node temp=new Node(data);

        Node p=start;
        if(start.info==val){
            temp.next=start;
            start=temp;
            return;
        }

        while(p!=null){
            if(p.info==val){
                break;
            }
            p=p.next;
        }

        if(p==null){
            System.out.println("Value "+ val +" not present in the list.");
        }
        else{
            temp.next=p;
            temp.prev=p.prev;
            p.prev.next=temp;
            p.prev=temp;
        }
    }

    public void CreateList(){
        System.out.print("Enter the number of nodes : ");
        int n=input.nextInt();
        

        if(n==0)
            return;
        
        System.out.print("Enter the first element : ");
        int num1=input.nextInt();
        InsertInEmpty(num1);

        for(int i=2;i<=n;i++){
            System.out.print("Enter the next element : ");
            int num2=input.nextInt();
            InsertAtEnd(num2);
        }
    }

    public void DeleteAtStart(){
        if(start==null){
            return;
        }
        if(start.next==null){                           //case where there is a single node
            start=null;
            return;
        }    
        start=start.next;
        start.prev=null;
    }

    public void DeleteLastNode(){
        if(start==null){
            return;
        }
        Node p=start;
        if(p.next==null){                                   //case where there is a single node
            start=null;
            return;
        }
        while(p.next!=null){
            p=p.next;
        }
        p.prev.next=null;    
    }

    public void DeleteNode(int val){
		if(start==null)                                         //list is empty
			return;
		
		if(start.next==null){	                                //list has only one node
			if(start.info==val) 
				start=null;
			else
				System.out.println(val + " not found in the list");
			return;
		}
		
		if(start.info==val){                                     //Deletion of first node
			start=start.next;  
			start.prev=null;
			return;
		}
		
		Node p=start.next;
		while(p.next!=null){
			if(p.info==val)     
			  break;
			p=p.next;
		}
		
		if(p.next!=null){                                        //node to be deleted is in between
			p.prev.next=p.next;
			p.next.prev=p.prev;
		}
		else{                                                    //p refers to last node
			if(p.info==val)                                     //node to be deleted is last node
				p.prev.next=null;
			else 
				System.out.println(val + " not found in the list");
		}        
    }

    public void ReverseList(){
        if(start==null){
            return;
        }

        Node p1=start;
        Node p2=p1.next;
        p1.next=null;
        p1.prev=p2;
        while(p2!=null){
            p2.prev=p2.next;
            p2.next=p1;
            p1=p2;
            p2=p2.prev;
        }
        start=p1;
    }

}
