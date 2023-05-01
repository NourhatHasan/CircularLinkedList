package com.company;

public class SircularLinkedList {
    Node head= new Node();
    Node tail= new Node();
    int size=0;

    public Node create(int value){
        Node node=new Node();
        node.value=value;

        //sirkulær
        node.next=node;
        head=tail=node;
        size=1;
        return head;

    }

    public void insertion(int value,int index){
        Node temp= new Node();
        temp.value=value;
        if(head==null){
            create(value);

        }
        else if(index==0){
         Node node=head;
         head=temp;
         tail.next=temp;
         temp.next=node;

         size+=1;
        }
        else if(index>=size){
            Node node=tail;
            tail=temp;
            node.next=temp;
            temp.next=head;
            size+=1;

        }
        else{
            Node node= head;
            int i=0;
            while (i<index-1){
                node=node.next;
                i+=1;
            }
            Node next=node.next;

            node.next=temp;
            temp.next=next;
            size+=1;
        }
    }

    public  void travers(){
        if (size==0){
            System.out.println(" the list is empty");
        }
        for (int i=0;i<size;i++){
            System.out.print(head.value);
            head=head.next;
            System.out.print("-> ");
        }
        System.out.println();

    }

    public void search(int value){

        for (int i=0;i<size;i++){
            if(head.value==value){
                System.out.println("value of "+ value +" is in index " +i);
              return;


            }

                head=head.next;


        }

        System.out.println("value of "+ value+ " do not exist");
    }

    public void delete(int index){
        Node prev= tail;
        if(index==0){
            head=head.next;

            size--;
            System.out.println("deleted");
        }
        else if(index>=size-1){
            tail=tail.next;
            size--;
            System.out.println("deleted");
        }
        else{
            Node temp=head;
            for (int i=0;i<index-1;i++){
                temp=temp.next;
                }

              temp.next=temp.next.next;
              size--;
            System.out.println("deleted");
            }

        }

        public void clearF(){
              head=null;
             tail.next=null;
             tail=null;
             System.out.println("cleared");
             size=0;
        }


    }



