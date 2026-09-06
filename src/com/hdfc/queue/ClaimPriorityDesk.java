package com.hdfc.queue;
import com.hdfc.model.*;import java.util.*;
public class ClaimPriorityDesk {
    private final PriorityQueue<Claim> q=new PriorityQueue<>(Comparator.comparingInt((Claim c)->p(c.getUrgency())).reversed().thenComparing(Claim::getId));
    private int p(Urgency u){return u==Urgency.HIGH?3:u==Urgency.MEDIUM?2:1;}public void add(Claim c){q.add(c);}public Claim processNext(){return q.poll();}public Claim peek(){return q.peek();}public boolean isEmpty(){return q.isEmpty();}public int size(){return q.size();}
}
