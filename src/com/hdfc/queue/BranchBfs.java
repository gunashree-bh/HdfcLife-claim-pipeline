package com.hdfc.queue;
import java.util.*;
public final class BranchBfs {
    private BranchBfs(){}
    public static <T> List<T> bfs(Map<T,List<T>> g,T start){List<T>r=new ArrayList<>();Set<T>v=new HashSet<>();Queue<T>q=new ArrayDeque<>();q.add(start);v.add(start);while(!q.isEmpty()){T x=q.remove();r.add(x);for(T n:g.getOrDefault(x,List.of()))if(v.add(n))q.add(n);}return r;}
}
