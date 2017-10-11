package list;

public interface Test {
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		l1.setNext(l2);
		l2.setNext(l3);
		System.out.println (l1.ListLength(l1));
	}
}
