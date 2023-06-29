package LinkedListAndArrays;


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class CloneLinkedListwithRandomandNextPointer {
    public Node copyRandomList(Node head) {
        Node iter = head;
        Node front = null;

        while (iter != null) {
            front = iter.next;
            Node copyNode = new Node(iter.val);
            iter.next = copyNode;
            copyNode.next = front;
            iter = front;
        }
        iter = head;
        while (iter != null) {
            if (iter.random != null) {
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }

        Node pesudoNode = new Node(0);
        Node copy = pesudoNode;
        iter = head;

        while (iter != null) {
            front = iter.next.next;
            copy.next = iter.next;
            copy = copy.next;
            iter.next = copy.next;
            iter = front;
        }

        return pesudoNode.next;
    }
}