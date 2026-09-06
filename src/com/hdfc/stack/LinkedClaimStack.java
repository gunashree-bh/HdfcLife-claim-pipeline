package com.hdfc.stack;
import com.hdfc.model.Claim; import com.hdfc.exception.StackEmptyException;
public class LinkedClaimStack implements ClaimStack {
    private static class N{Claim c;N n;N(Claim c,N n){this.c=c;this.n=n;}} private N top;private int size;
    public void push(Claim c){top=new N(c,top);size++;} public Claim pop(){if(isEmpty())throw new StackEmptyException("Stack is empty");Claim c=top.c;top=top.n;size--;return c;}
    public Claim peek(){if(isEmpty())throw new StackEmptyException("Stack is empty");return top.c;} public boolean isEmpty(){return top==null;}public int size(){return size;}
}
