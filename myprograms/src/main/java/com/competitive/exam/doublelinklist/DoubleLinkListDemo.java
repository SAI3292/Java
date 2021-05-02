package com.competitive.exam.doublelinklist;

public class DoubleLinkListDemo{

	public static void main(String args[]){
		DoubleLinkListService n = new DoubleLinkListService();

		for(int i=1;i<=10;i++){
			n.addElement(i);
		}
		//n.addElement(1);

		n.printElement();
	}
}