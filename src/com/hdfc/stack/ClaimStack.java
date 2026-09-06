package com.hdfc.stack;
import com.hdfc.model.Claim;
public interface ClaimStack {void push(Claim c); Claim pop(); Claim peek(); boolean isEmpty(); int size();}
