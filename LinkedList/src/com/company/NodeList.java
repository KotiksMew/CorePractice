package com.company;

public class NodeList { //hvost vniz golova vverh
    private Node head;
    private Node tail;

    public NodeList() {
        head = null;
        tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int value) {// vverh v golov
        Node temp = new Node(value);
        if (isEmpty()){
            tail = temp;
            }
        else
            head.prev=temp;
        temp.next=head;
        head=temp;
    }

    public void addLast (int value){ // v niz v hvost
        Node temp= new Node(value);
        if(isEmpty()){
            head= temp;
    }else
        {tail.next=temp;}
        temp.prev=tail;
        tail=temp;
    }
    public void addIndex(int value, int index){ //po index
        Node cur = head;
        int i = 0;
        while (cur!=null&& i!=index){
            cur= cur.next;
            i++;
        }
        Node temp= new Node(value);
        cur.prev.next= temp;
        temp.prev= cur.prev;
        cur.prev=temp;
        temp.next=cur;
    }
public void removeFirst(){
        Node temp=head;
        if (head.next==null){
            tail=null;
        }
        else
        {head.next.prev=null;}
        head=head.next;
}

    public void print(){ //proverka
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp= temp.next;
        }
    }
}
