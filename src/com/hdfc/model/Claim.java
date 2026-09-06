package com.hdfc.model;
public class Claim {
    private final String id, policyId, customerName;
    private final int amount;
    private final Urgency urgency;
    private final ClaimStatus status;
    public Claim(String id,int amount,String policyId,String customerName,Urgency urgency,ClaimStatus status){
        this.id=id; this.amount=amount; this.policyId=policyId; this.customerName=customerName; this.urgency=urgency; this.status=status;
    }
    public String getId(){return id;} public int getAmount(){return amount;} public String getPolicyId(){return policyId;}
    public String getCustomerName(){return customerName;} public Urgency getUrgency(){return urgency;} public ClaimStatus getStatus(){return status;}
    public String toString(){return id+" ("+customerName+", "+amount+", "+urgency+", "+status+")";}
}
