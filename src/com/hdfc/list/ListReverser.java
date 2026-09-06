package com.hdfc.list;
public final class ListReverser {
    private ListReverser(){}
    public static void reverseIterative(ClaimLinkedList l){ClaimNode p=null,c=l.getHeadNode();while(c!=null){ClaimNode n=c.next;c.next=p;p=c;c=n;}l.setHeadForAlgorithm(p);}
    public static void reverseRecursive(ClaimLinkedList l){l.setHeadForAlgorithm(rev(l.getHeadNode(),null));}
    private static ClaimNode rev(ClaimNode c,ClaimNode p){if(c==null)return p;ClaimNode n=c.next;c.next=p;return rev(n,c);}
}
