package com.hdfc.thread;
import com.hdfc.model.Claim;import com.hdfc.queue.CircularClaimQueue;
public class ProducerConsumer {private final CircularClaimQueue q;public ProducerConsumer(CircularClaimQueue q){this.q=q;}public synchronized void produce(Claim c){q.enqueue(c);notifyAll();}public synchronized Claim consume() throws InterruptedException{while(q.isEmpty())wait();return q.dequeue();}}
