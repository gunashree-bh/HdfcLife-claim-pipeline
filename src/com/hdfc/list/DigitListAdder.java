package com.hdfc.list;
import com.hdfc.model.*;
public final class DigitListAdder {
    private DigitListAdder(){}
    public static ClaimLinkedList add(ClaimLinkedList a,ClaimLinkedList b){ClaimLinkedList r=new ClaimLinkedList();ClaimNode p=a.getHeadNode(),q=b.getHeadNode();int carry=0;
        while(p!=null||q!=null||carry!=0){int x=p==null?0:p.claim.getAmount(),y=q==null?0:q.claim.getAmount(),sum=x+y+carry;r.add(new Claim("DIGIT",sum%10,"N/A","Digit",Urgency.LOW,ClaimStatus.RECEIVED));carry=sum/10;if(p!=null)p=p.next;if(q!=null)q=q.next;}return r;}
}
