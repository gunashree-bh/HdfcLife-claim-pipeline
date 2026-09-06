package com.hdfc.list;
import com.hdfc.exception.*; import com.hdfc.model.Claim;
public class ClaimLinkedList {
    private ClaimNode head; private int size;
    public void add(Claim c){ClaimNode n=new ClaimNode(c); if(head==null)head=n;else{ClaimNode p=head;while(p.next!=null)p=p.next;p.next=n;}size++;}
    public void addLast(Claim c){add(c);}
    public void insertAt(int i,Claim c){if(i<0||i>size)throw new InvalidIndexException("Invalid index: "+i); ClaimNode n=new ClaimNode(c);
        if(i==0){n.next=head;head=n;}else{ClaimNode p=nodeAt(i-1);n.next=p.next;p.next=n;}size++;}
    public Claim deleteAt(int i){if(i<0||i>=size)throw new InvalidIndexException("Invalid index: "+i); Claim r;
        if(i==0){r=head.claim;head=head.next;}else{ClaimNode p=nodeAt(i-1);r=p.next.claim;p.next=p.next.next;}size--;return r;}
    public Claim get(int i){return nodeAt(i).claim;} public ClaimNode getHead(){return head;} public ClaimNode getHeadNode(){return head;}
    public int size(){return size;} public boolean isEmpty(){return size==0;}
    public ClaimNode nodeAt(int i){if(i<0||i>=size)throw new InvalidIndexException("Invalid index: "+i);ClaimNode p=head;for(int x=0;x<i;x++)p=p.next;return p;}
    public void linkTailToIndex(int i){if(size==0)throw new EmptyListException("List is empty");ClaimNode t=nodeAt(i),p=head;while(p.next!=null)p=p.next;p.next=t;}
    void setHeadForAlgorithm(ClaimNode h){head=h;}
    public String values(){StringBuilder s=new StringBuilder();ClaimNode p=head;int g=0;while(p!=null&&g<=size){if(s.length()>0)s.append(", ");s.append(p.claim.getAmount());p=p.next;g++;}return s.toString();}
    public String toString(){return values();}
}
