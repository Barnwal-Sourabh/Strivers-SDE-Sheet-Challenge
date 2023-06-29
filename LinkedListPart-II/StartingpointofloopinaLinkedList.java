
public class StartingpointofloopinaLinkedList {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            slow  = slow.next;
            fast  = fast.next.next;
            if(slow == fast){
                ListNode entry = head;
                while(slow != entry){
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }    
}
