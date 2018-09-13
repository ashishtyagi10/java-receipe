package com.thinkin.javareceipe;

public class MinimumAmount {

    public static void main(String ... args){
        int [] first = {4,4,9,2,3};
        int [] second = {4,1,2,3,4};
        int [] third = {10,18,1,1,16,12,10,18,19,6,6};
        System.out.println(calculateAmount(first));
        System.out.println(calculateAmount(second));
        System.out.println(calculateAmount(third));
    }

    static long calculateAmount(int[] prices) {
        int n=prices[0];
        int sum=prices[1];
        int cost=prices[1];
        int discount=prices[1];
        if(prices == null || prices.length < n){
            return -1;
        }else{
            for(int i=2;i<prices.length;i++){
                cost=prices[i]-discount;
                if(cost>=0)
                sum=sum+cost;
                if(discount>prices[i]){
                    discount=prices[i];
                }
            }
        }
        return sum;
    }
}
