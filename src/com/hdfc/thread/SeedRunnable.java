package com.hdfc.thread;
import com.hdfc.list.*;import com.hdfc.model.Claim;
public class SeedRunnable implements Runnable {private final ClaimLinkedList l;private final Claim[] c;public SeedRunnable(ClaimLinkedList l,Claim...c){this.l=l;this.c=c;}public void run(){for(Claim x:c)l.add(x);}}
