package com.hdfc.list;
import com.hdfc.model.Claim;
public class ClaimNode {
    public Claim claim; public ClaimNode next;
    public ClaimNode(Claim c){claim=c;} public Claim getClaim(){return claim;} public ClaimNode getNext(){return next;}
    public void setNext(ClaimNode n){next=n;}
}
