package com.hdfc.list;
public final class CycleDetector {
    private CycleDetector(){}
    public static boolean hasCycle(ClaimLinkedList l){ClaimNode s=l.getHeadNode(),f=s;while(f!=null&&f.next!=null){s=s.next;f=f.next.next;if(s==f)return true;}return false;}
}
