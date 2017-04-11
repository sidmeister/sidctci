/*
Implement an algorithm to find the kth  to last element of a singly link list
*/


public class KthLastLinkListP11 {

    public ListNode getNthFromEndTwoPtr(ListNode head, int n) {
    ListNode first = head;
    ListNode second = head;
    // Advances first pointer so that the gap between first and second is n nodes apart
    for (int i = 0; i < n; i++) {
        first = first.next;
    }
    // Move first to the end, maintaining the gap
    while (first != null) {
        first = first.next;
        second = second.next;
    }
    return second;
}

    public static void main(String[] args){

    }
}