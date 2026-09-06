package com.hdfc.stack;
import java.util.*;
public final class ParenthesesChecker {
    private ParenthesesChecker(){}
    public static boolean isBalanced(String s){Deque<Character>d=new ArrayDeque<>();for(char c:s.toCharArray()){if("([{".indexOf(c)>=0)d.push(c);else if(")]}".indexOf(c)>=0){if(d.isEmpty())return false;char o=d.pop();if(c==')'&&o!='('||c==']'&&o!='['||c=='}'&&o!='{')return false;}}return d.isEmpty();}
    public static boolean check(String s){return isBalanced(s);}
}
