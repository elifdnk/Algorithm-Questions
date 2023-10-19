package linkedList_questions;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

       int lengthA = getListLength(headA);
       int lengthB = getListLength(headB);

       while (lengthA>lengthB){
           lengthA--;
           headA=headA.next;
       }
       while (lengthB>lengthA){
           lengthB--;
           headB=headB.next;
       }

       while (headA !=headB){
           headA=headA.next;
           headB=headB.next;
       }
       return headA;
    }

    private int getListLength(ListNode node) {

        int length =0;
        while(node !=null){
            length++;
            node=node.next;
        }

        return length;
    }


}
/*
        * Definition for singly-linked list.
        * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */