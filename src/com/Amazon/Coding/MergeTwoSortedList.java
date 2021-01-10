package com.Amazon.Coding;

public class MergeTwoSortedList {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tempHead = new ListNode();
        ListNode head = tempHead;
        for(;l1 != null || l2 != null;){
            if(l1 == null){
                for(;l2 != null;){
                    tempHead.next = l2;
                    tempHead = tempHead.next;
                    l2 = l2.next;
                }
            }
            else if(l2 == null){
                for(;l1 != null;){
                    tempHead.next = l1;
                    tempHead = tempHead.next;
                    l1 = l1.next;
                }
            }
            else if(l1.val < l2.val){
                tempHead.next = l1;
                tempHead = tempHead.next;
                l1 = l1.next;
            }
            else{
                tempHead.next = l2;
                tempHead = tempHead.next;
                l2 = l2.next;
            }
        }
        return head.next;
    }

}
