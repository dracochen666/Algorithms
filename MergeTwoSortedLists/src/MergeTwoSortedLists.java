class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.val = 1;
        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode();
        l2.val = 1;
        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);

        ListNode merge = mergeTwoLists1(l1,l2);
        while (merge != null) {
            System.out.println(merge.val);
            merge = merge.next;
        }
    }
    public static ListNode mergeTwoLists1(ListNode list1, ListNode list2) { // 0ms 41MB
        ListNode head = new ListNode();
        ListNode temp = head;
        if (list1 == null && list2 != null) {
            return list2;
        }
        if (list1 != null && list2 == null) {
            return list1;
        }
        while (list1 != null && list2 !=null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }else {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
            if (list1 == null) {
                temp.next = list2;
            }
            if (list2 == null) {
                temp.next = list1;
            }

        }
        return head.next;
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) { //0ms 41MB
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }

}
