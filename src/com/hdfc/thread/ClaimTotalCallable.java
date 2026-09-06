package com.hdfc.thread;
import com.hdfc.list.*;import java.util.concurrent.Callable;
public class ClaimTotalCallable implements Callable<Integer>{private final ClaimLinkedList l;public ClaimTotalCallable(ClaimLinkedList l){this.l=l;}public Integer call(){int t=0;ClaimNode n=l.getHeadNode();int g=0;while(n!=null&&g++<=l.size()){t+=n.claim.getAmount();n=n.next;}return t;}}
