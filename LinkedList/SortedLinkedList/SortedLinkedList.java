package LinkedList.SortedLinkedList;

import java.util.Scanner;

public class SortedLinkedList {
    private Node start;

    Scanner input=new Scanner(System.in);

    SortedLinkedList(){
        start=null;
    }
    
    public void Display(){
        if(start==null){
            System.out.println("The list is empty");
            return;
        }

        Node p=start;
        System.out.print("The list is : ");
        while(p!=null){
            System.out.print(p.info+" ");
            p=p.link;
        }
        System.out.println(" ");
    }

    public void InsertInOrder(int val){
        Node temp=new Node(val);

        if(start==null || start.info>val){
            temp.link=start;
            start=temp;
            return;
        }

        Node p=start;
        while(p.link!=null && p.link.info<=val){
            p=p.link;
        }

        temp.link=p.link;
        p.link=temp;
    }

    public void CreateList(){
        System.out.print("Enter the number of nodes :");
        int n=input.nextInt();
        
        if(n==0){
            return;
        }

        for(int i=1;i<=n;i++){
            System.out.print("Enter the value : ");
            int num=input.nextInt();
            InsertInOrder(num);
        }
        System.out.println();
    }

    public void Search(int val){
        if(start==null){
            System.out.println("List is empty");
            return;
        }
        Node p=start;
        int pos=1;
        while(p!=null && p.info<=val){
            if(p.info==val){
                break;
            }
            pos++;
            p=p.link;
        }
        if(p==null ||p.info>val){
            System.out.println("Value "+val+" is not present in the list");
        }
        else{
            System.out.println("Value "+val+" found at position "+pos);
        }
    }
}
