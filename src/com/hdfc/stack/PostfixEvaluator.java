package com.hdfc.stack;
import java.util.*;
public final class PostfixEvaluator {
    private PostfixEvaluator(){}
    public static int evaluate(String s){Deque<Integer>d=new ArrayDeque<>();for(String t:s.trim().split("\\s+")){if(t.matches("-?\\d+"))d.push(Integer.parseInt(t));else{int b=d.pop(),a=d.pop();d.push(switch(t){case "+"->a+b;case "-"->a-b;case "*"->a*b;case "/"->a/b;case "%"->a%b;default->throw new IllegalArgumentException("Unknown operator");});}}return d.pop();}
}
