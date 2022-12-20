package LinkedList.CircularLinkedList;

import java.util.Scanner;

public class CircularLinkedList {
    private Node last;

    Scanner input=new Scanner(System.in);
    
    public CircularLinkedList(){
        last=null;
    }
    
    public void Display(){
        if(last==null){
            System.out.println("List is empty");
            return;
        }

        Node p=last.link;
        do{
            System.out.print(p.info+" ");
            p=p.link;
        }while(p!=last.link);
        System.out.println( );
    }

    public void InsertAtStart(int val){
        Node temp=new Node(val);
        temp.link=last.link;
        last.link=temp;
    }

    public void InsertAtEnd(int val){
        Node temp=new Node(val);
        temp.link=last.link;
        last.link=temp;
        last=temp;
    }

    public void InsertAtEmpty(int val){
        Node temp=new Node(val);
        last=temp;
        last.link=last;
    }

    public void InsertAfter(int data,int val){
        Node p=last.link;
        Node  temp=new Node(val);
        do{
            if(p.info==data){
                break;
            }
            p=p.link;
        }while(p!=last.link);

        if(p==last.link && p.info!=data){
            System.out.println(data+" is not present in the list.");
        }
        else{
            temp.link=p.link;
            p.link=temp;
            if(p==last)
                last=temp;
        }
    }

    public void CreateList(){
        System.out.print("Enter the number of nodes : ");
        int n=input.nextInt();

        if(n==0){
            return;
        }
        System.out.print("Enter the 1st element :");
        int num1=input.nextInt();
        InsertAtEmpty(num1);

        for(int i=2;i<=n;i++){
            System.out.print("Enter the next element : ");
            int num2=input.nextInt();
            InsertAtEnd(num2);
        }
    }

    public void DeleteFirstNode(){
        if(last==null)
            return;
        
        if(last.link==last){
            last=null;
            return;
        }
        last.link=last.link.link;
    }

    public void DeleteLastNode(){
        if(last==null)
            return;
        
        if(last.link==last){
            last=null;
            return;
        }

        Node p=last.link;
        while(p.link!=last){
            p=p.link;
        }
        p.link=last.link;
        last=p;
    }

    public void DeleteNode(int data){
        if(last==null)
            return;

        if(last.link==last && last.info==data){
            last=null;
            return;
        }

        if(last.link.info==data){
            last.link=last.link.link;
            return;
        }

        Node p=last.link;
        while(p.link!=last.link){
            if(p.link.info==data){
                break;
            }
            p=p.link;
        }

        if(p.link==last.link){
            System.out.println("Value "+data+" not present in list.");
        }
        else{
            p.link=p.link.link;
            if(last.info==data){
                last=p;
            }

        }
        
    }

    public  void Concatenate(CircularLinkedList list){
        if(last==null)
            return;
        if(list.last==null)
            return;
        
        Node p=last.link;
        last.link=list.last.link;
        list.last.link=p;
        last=list.last;
    }

}
