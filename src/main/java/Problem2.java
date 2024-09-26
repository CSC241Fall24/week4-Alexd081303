public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);
        
        if (position <= 1 || head == null) {
            newNode.next = head;
            return newNode;
        }
        
        ListNode current = head;
        int currentPosition = 1;
        
     
        while (current.next != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        
      
        newNode.next = current.next;
        current.next = newNode;
        
        return head;
    }
}
