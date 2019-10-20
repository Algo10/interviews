
public class Leetcode_RemoveDuplicateFromSortedList {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode node = head;
        int prevValue = node.val;
        ListNode prevNode = node;
        while(node!=null && node.next!=null){
            while(node!=null && node.val==prevValue) {
                node = node.next;
            }
            prevNode.next=node;
            if(node!=null){
                 prevValue = node.val;
                 prevNode = node;
            }
        }
        return head;
    }
}
