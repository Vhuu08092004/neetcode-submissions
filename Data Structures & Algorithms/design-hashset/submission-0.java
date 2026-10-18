class MyHashSet {
    private static class ListNode {
        int key;
        ListNode next;
        ListNode (int key) {this.key = key;}
    }
    private final int MAX_SIZE = 10001;
    private final ListNode[] set;

    public MyHashSet() {
        set = new ListNode[MAX_SIZE];
        for (int i = 0; i < MAX_SIZE; i++) {
            set[i] = new ListNode(0);
        }
    }
    
    private int hash (int key) {
        return key % MAX_SIZE;
    }

    public void add(int key) {
        if (contains(key)) return;
        ListNode cur = set[hash(key)];
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(key);
    }
    
    public void remove(int key) {
        ListNode cur = set[hash(key)];
        while (cur.next != null) {
            if (cur.next.key == key) {
                cur.next = cur.next.next;
                break;
            }
            cur =  cur.next;
        }
    }
    
    public boolean contains(int key) {
        ListNode cur = set[hash(key)].next;
        while(cur != null) {
            if (cur.key == key) return true;
            cur = cur.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */