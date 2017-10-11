package list;

public class ListNode {

	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
	}
	public ListNode(int data,ListNode next) {
		this.data=data;
		this.next=next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public int ListLength(ListNode headNode) {
		int length=0;
		ListNode currentNode = headNode;
		while (currentNode!=null) {
			length++;
			currentNode=currentNode.getNext();
		}
		return length;
	}
	
	ListNode InsertInLinkedList(ListNode headNode,ListNode nodeToInsert,int position) {
		if(headNode==null)
			return nodeToInsert;
		int size = ListLength(headNode);
		
		if(position>size+1||position<1) {
			System.out.println("插入位置越界");
			return headNode;
		}
		if(position==1) {//表头插入
			nodeToInsert.setNext(headNode);
			return nodeToInsert;
		}else {
			ListNode previousNode =headNode;
			int count=1;
			
			while(count<position-1) {
				previousNode =previousNode.getNext();
				count++;
			}
			ListNode currentNode =previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			previousNode.setNext(nodeToInsert);
			
		}
			return headNode;
	}
	
	void DeleteLinkedList(ListNode head) {
		ListNode auxilaryNode,iterator=head;
		while(iterator!=null) {
			auxilaryNode=iterator.getNext();
			iterator=null;
			iterator=auxilaryNode;
		}
	}
	
	ListNode DeleteNodeFromLinkedList(ListNode headNode,int position) {
		int size=ListLength(headNode);
		if(position>size+1||position<1) {
			System.out.println("位置越界");
			return headNode;
		}
		
		if(position==1) {//删除表头
			ListNode currentNode=headNode.getNext();
			headNode=null;
			return currentNode;
		}else {
			ListNode previousNode =headNode;
			int count=1;
			while(count<position) {
				previousNode=previousNode.getNext();
				count++;
			}
			ListNode currentNode =previousNode.getNext();
			previousNode.setNext(currentNode.getNext());
			currentNode=null;
		}
		return headNode;
	}
}
