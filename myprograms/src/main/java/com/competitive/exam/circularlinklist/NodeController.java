package com.competitive.exam.circularlinklist;

public class NodeController{
	Node head = null;


public void addelement(int data){
	Node newNode = new Node(data);
	if(head == null){
		System.out.println("1st element");
		head = newNode;
		newNode.next = head;
	}
	else{
		//System.out.println("other element");
		Node temp = head;
		while(temp.next != head){
			temp=temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
}

public void printElement(){
	System.out.println("printing");
	Node temp = head;
	while(temp.next != head){
		System.out.println("data is "+temp.data);
		temp=temp.next;
	}
	System.out.println("data is "+temp.data);
}

public int countElement(){
	int count = 0;
	Node temp = head;
	while(temp.next != head){
		temp = temp.next;
		count++; 
	}
	return count+1;
}

public void startKilling(){
	Node temp = head;
	while(temp.next.next!=temp){
		temp.next = temp.next.next;
		temp=temp.next;
	}
	temp.next=temp;
	System.out.println(temp.data);
}

}