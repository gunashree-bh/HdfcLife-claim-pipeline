package com.hdfc.stack;
import com.hdfc.model.Claim; import com.hdfc.exception.*;
public class ArrayClaimStack implements ClaimStack {
    private final Claim[] a;private int top=-1; public ArrayClaimStack(int n){a=new Claim[n];}
    public void push(Claim c){if(top==a.length-1)throw new StackFullException("Stack is full");a[++top]=c;}
    public Claim pop(){if(isEmpty())throw new StackEmptyException("Stack is empty");return a[top--];}
    public Claim peek(){if(isEmpty())throw new StackEmptyException("Stack is empty");return a[top];}
    public boolean isEmpty(){return top<0;} public int size(){return top+1;}
}
