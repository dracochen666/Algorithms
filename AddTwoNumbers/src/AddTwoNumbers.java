public class AddTwoNumbers {
    public static class ListNode {
         int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tmp;
        int carry = 0;
        ListNode head = new ListNode();
        ListNode result = head;

        while (l1 != null || l2 != null){
            if (l1 == null) {
                tmp = l2.val + carry;
                l2 = l2.next;
            }else if (l2 == null) {
                tmp = l1.val + carry;
                l1 = l1.next;
            }else {
                tmp = (l1.val + l2.val) + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            carry = 0;
            if (tmp >= 10) {
                result.next = new ListNode((tmp % 10));
                carry = 1;
            }else {
                result.next = new ListNode((tmp % 10));
            }

            result = result.next;

        }
        if (carry == 1) {
            result.next = new ListNode(1);
        }
        return head.next;

    }

    public static void main(String[] args) {
        // 2435 + 564 = 7085   5807
        // 999 + 111
        ListNode l1 = new ListNode();
        l1.val = 2;
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(6);
//        l1.next.next.next = new ListNode(6);
        ListNode l2 = new ListNode();
        l2.val = 5;
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1,l2);
        ListNode temp = result;
        while (true){
            if (temp == null) {
                return;
            }
            System.out.print(temp.val);
            temp = temp.next;
        }
//        System.out.println("计算");
//        System.out.print((8%10));

    }
}
