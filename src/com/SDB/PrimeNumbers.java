package com.SDB;

public class PrimeNumbers {
    public static boolean isPrime(int n){
        if(n<2)return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:\n");
        for(int i=2;i<=100;i++){
            if(isPrime(i)) System.out.print(i+"  ");
        }
    }
}