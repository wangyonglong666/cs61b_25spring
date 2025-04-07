public class SLList {
    private static class IntNode {
        int item;
        IntNode next;

        IntNode(int i, IntNode n) {
            this.item = i;
            this.next = n;
        }
    }

    private IntNode first;

    public SLList(int x) {
        this.first = new IntNode(x, null);
    }

    public void addFirst(int x) {
        first = new IntNode(x, this.first);
    }

    public int getFirst() {
        return this.first.item;
    }

}
