package com.hdfc.queue;
import com.hdfc.model.Claim; import com.hdfc.exception.*;
public class CircularClaimQueue {
    private final Claim[] q;private int front,rear,size;public CircularClaimQueue(){this(10);}public CircularClaimQueue(int n){q=new Claim[n];}
    public void enqueue(Claim c){if(isFull())throw new QueueFullException("Queue is full");q[rear]=c;rear=(rear+1)%q.length;size++;}
    public Claim dequeue(){if(isEmpty())throw new QueueEmptyException("Queue is empty");Claim c=q[front];q[front]=null;front=(front+1)%q.length;size--;return c;}
    public Claim peek(){if(isEmpty())throw new QueueEmptyException("Queue is empty");return q[front];}public boolean isEmpty(){return size==0;}public boolean isFull(){return size==q.length;}public int size(){return size;}
}
