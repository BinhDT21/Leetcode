package AlgorithmsPractices.AddTwoNumbers;

public class Test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;


        ListNode l8 = new ListNode(9);
        ListNode l9 = new ListNode(9);
        ListNode l10 = new ListNode(9);
        ListNode l11 = new ListNode(9);
        l8.next = l9;
        l9.next = l10;
        l10.next = l11;

        Solution solution = new Solution();
        ListNode rs = solution.addTwoNumbers(l1, l8);

        while (rs!=null){
            System.out.print(rs.val + " ");
            rs = rs.next;
        }
    }
}
