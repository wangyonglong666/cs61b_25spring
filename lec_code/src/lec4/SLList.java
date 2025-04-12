package lec4;

public class SLList {
    private static class IntNode {
        int item;
        IntNode next;

        IntNode(int i, IntNode n) {
            this.item = i;
            this.next = n;
        }
    }

    private IntNode sentinel;
    private int size;

    public SLList(int x) {
        this.sentinel = new IntNode(5498, null);
        this.sentinel.next = new IntNode(x,null);
        size = 1;
    }

    public SLList() {
        this.sentinel = new IntNode(5498,null);
        this.size = 0;
    }


    //头插法
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, this.sentinel.next);
        size++;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    //尾插法
    public void addLast(int x) {
        size++;
        IntNode p = this.sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x,null);
        size++;
    }
    //size()实现
    //1.迭代版本
//    public int size() {
//        IntNode p = this.first;
//        int count = 1;
//        while (p.next != null ) {
//            p = p.next;
//            count++;
//        }
//        return count;
//    }
    //2.递归版本
//    public int size() {
//        return size(this.first);
//    }
//
//    private int size(IntNode i) {
//        if (i == null) {
//            return 0;
//        } else {
//            return 1 + size(i.next);
//        }
//    }
    //3.最快速的方法
    public int size() {
        return this.size;
    }

}
