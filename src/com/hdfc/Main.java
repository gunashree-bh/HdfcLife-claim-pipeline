package com.hdfc;
import com.hdfc.model.*;import com.hdfc.list.*;import com.hdfc.queue.*;import com.hdfc.stack.*;import com.hdfc.thread.*;
import java.util.concurrent.*;
public class Main {
 public static void main(String[] args)throws Exception
 {
  ClaimLinkedList l=new ClaimLinkedList();
  Claim c1=new Claim(
          "CLM-01",
          25000,
          "HDFC-LIFE-1001",
          "Anitha Sharma",
          Urgency.HIGH,
          ClaimStatus.RECEIVED
  );


  Claim c2=new Claim(
          "CLM-02",
          18000,
          "HDFC-LIFE-1002",
          "Rahul Mehta",
          Urgency.MEDIUM,
          ClaimStatus.RECEIVED
  )
          ;
  Claim c3=claim(
          "CLM-03",
          42000),
          c4=claim("CLM-04",15000),
          c5=claim("CLM-05",31000),
          c6=claim("CLM-06",9000
          );


  l.add(c1);l.add(c2);l.add(c3);l.add(c4);l.add(c5);l.add(c6);

  System.out.println("1. Seed list -> "+l);

  l.insertAt(2,claim("INS",22000));System.out.println("2. After insertAt(2, 22000) -> "+l);

  l.deleteAt(2);System.out.println("3. After deleteAt(2) -> "+l);

  ListReverser.reverseIterative(l);System.out.println("4. Reverse iterative -> "+l);

  ListReverser.reverseRecursive(l);System.out.println("5. Reverse recursive -> "+l);


  System.out.println("6. Middle of seed -> "+l.get(l.size()/2-1).getAmount());

  System.out.println("7. hasCycle on seed -> "+CycleDetector.hasCycle(l));

  l.linkTailToIndex(2);System.out.println("8. hasCycle after linking tail to index 2 -> "+CycleDetector.hasCycle(l));

  ClaimLinkedList clean=new ClaimLinkedList();clean.add(c1);clean.add(c2);clean.add(c3);clean.add(c4);clean.add(c5);clean.add(c6);

  System.out.println("\nTesting Queue");CircularClaimQueue q=new CircularClaimQueue(5);q.enqueue(c1);q.enqueue(c2);System.out.println("Processing: "+q.dequeue());System.out.println("Processing: "+q.dequeue());

  System.out.println("\nTesting Priority Desk");ClaimPriorityDesk d=new ClaimPriorityDesk();d.add(c2);d.add(c1);d.add(c4);System.out.println("Priority processing: "+d.processNext());

  System.out.println("\nTesting Stack");ClaimStack s=new LinkedClaimStack();s.push(c1);s.push(c2);System.out.println("Stack pop: "+s.pop());

  System.out.println("\nTesting expressions");System.out.println("Balanced: "+ParenthesesChecker.isBalanced("{[()]}"));System.out.println("Postfix: "+PostfixEvaluator.evaluate("5 3 + 2 *"));

  ExecutorService e=Executors.newSingleThreadExecutor();System.out.println("\nClaim total: "+e.submit(new ClaimTotalCallable(clean)).get());e.shutdown();
 }

 static Claim claim(String id,int a){return new Claim(id,a,"POL-"+id,"Customer "+id,Urgency.MEDIUM,ClaimStatus.RECEIVED);

 }

}
