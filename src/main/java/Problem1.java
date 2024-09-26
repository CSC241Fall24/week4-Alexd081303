public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return copyList(l2);
        }
        if (l2 == null) {
            return l1;
        }
        ListNode current = l1;
        while (current.next != null) {
            current = current.next;
        }
        ListNode l2Copy = copyList(l2);
        current.next = l2Copy;
        return l1;
    }

    private static ListNode copyList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = new ListNode(head.val);
        ListNode current = newHead;
        ListNode originalCurrent = head.next;
        while (originalCurrent != null) {
            current.next = new ListNode(originalCurrent.val);
            current = current.next;
            originalCurrent = originalCurrent.next;
        }
        return newHead;
    }
}
