package Linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    // insert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index -1, node.next);
        return node;
    }

    // leetcode 83. Remove Duplicates from Sorted List
    public void duplicates(){
        Node node = head;

        while (node != null && node.next != null) {
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // leetcode  21. Merge Two Sorted Lists
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    // leetcode 141. Linked List Cycle
//     public boolean hasCycle(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//
//        while(fast !=  null && fast.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                return true;
//            }
//        }
//        return false;
//    }

    // leetcode 142. Linked List Cycle II
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast !=  null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
               length = lengthCycle(slow);
               break;
            }
        }

        if (length == 0){
            return null;
        }
        //find the start node of the cycle
        ListNode f = head;
        ListNode s = head;

        while(length > 0){
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if(slow == 1){
            return true;
        }
        return false;

    }
    private int findSquare(int number){
        int ans = 0;
        while(number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

    // find length of the cycle
     public int  lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast !=  null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                // calculate the length
                ListNode temp = slow;
                int length = 0;

                while (temp != slow) {
                    do{
                        temp = temp.next;
                        length++;
                    } while (temp != slow);
                }
                return length;
            }
        }
        return 0;
    }

    // recursion reverse linked list
    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // in place reverse linked list
    // 206. Reverse Linked List

    public void reverse(){
        if (size < 2){
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
    }

    // 92. Reverse Linked List II
     public ListNode reverseBetween(ListNode head, int left, int right) {
       if(left == right){
           return head;
       }
       // skip the first left -1 nodes
        ListNode current = head;
        ListNode prev = null;
        for(int i = 0 ; current != null && i < left - 1; i++){
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        //reverse between left and right
         ListNode next = current.next;
       for(int i = 0; current != null && i < right - left + 1; i++){
           current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
       }
       if (last != null){
           last.next = prev;
       } else {
           head = prev;
       }
         newEnd.next = current;
         return head;
    }

   // 234. Palindrome Linked List

  public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.display();
        list.duplicates();
        list.display();
    }

    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}