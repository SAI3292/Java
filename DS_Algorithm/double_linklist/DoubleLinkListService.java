public class DoubleLinkListService{
	NodeDoubleLinkList head = null; 

	public void addElement(int data){
		NodeDoubleLinkList newNode = new NodeDoubleLinkList(data);
		if(head == null){
			head = newNode;
		}
		else{
		NodeDoubleLinkList temp = head;
		System.out.println(head.data);
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}
	}

	public void printElement(){
		System.out.println("print element");
		NodeDoubleLinkList temp = head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void reverseElement(){
		System.out.println("reverse element");
		NodeDoubleLinkList temp = head;
		NodeDoubleLinkList lastvisited;
		
	}
}

