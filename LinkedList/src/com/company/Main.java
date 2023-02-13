package com.company;

public class Main {

    public static void main(String[] args) {
	NodeList list= new NodeList();

	list.addLast(4);
	list.addLast(3);
	list.addLast(2);
	list.addFirst(1);
	list.addIndex(5,2);
	list.print();

		System.out.println();
		list.removeFirst();
		list.print();
    }
}
