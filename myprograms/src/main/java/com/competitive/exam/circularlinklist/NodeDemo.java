package com.competitive.exam.circularlinklist;

public class NodeDemo{
	
	public static void main(String args[]){
	NodeController n = new NodeController();
	System.out.println("Demo");
	//n.addelement(1);
	//n.addelement(2);
	//n.addelement(3);
	for(int i=1;i<=500;i++){
		n.addelement(i);
	}
	n.printElement();
	System.out.println("count is "+n.countElement());
	System.out.println("Started Killing");
	n.startKilling();
	//n.printElement();
	
	}
}