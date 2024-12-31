package AlgorithmsPractices.AddTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sumValue;
        int redundantValue = 0;
        int digitValue;
        ListNode newNode = new ListNode();
        ListNode headNode = newNode;
        while (l1 != null && l2 != null) {
            sumValue = l1.val + l2.val + redundantValue;
            digitValue = sumValue % 10;
            redundantValue = sumValue / 10;
            ListNode currNode = new ListNode(digitValue);
            newNode.next = currNode;
            newNode = newNode.next;

            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            sumValue = l1.val + redundantValue;
            digitValue = sumValue % 10;
            redundantValue = sumValue / 10;
            ListNode currNode = new ListNode(digitValue);
            newNode.next = currNode;
            newNode = newNode.next;

            l1 = l1.next;
        }
        while(l2 != null){
            sumValue = l2.val + redundantValue;
            digitValue = sumValue % 10;
            redundantValue = sumValue / 10;
            ListNode currNode = new ListNode(digitValue);
            newNode.next = currNode;
            newNode = newNode.next;

            l2 = l2.next;
        }

        if(redundantValue > 0){
            ListNode currNode = new ListNode(redundantValue);
            newNode.next = currNode;
            newNode = newNode.next;
        }

        return headNode.next;
    }
}
