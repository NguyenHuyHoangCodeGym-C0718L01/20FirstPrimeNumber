package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numberOfPrime = 0;
        for(int i = 1; i < 100; i++){
            int count = 0;
            for(int j = 1; j <=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Prime Number: "+i);
                numberOfPrime++;
            }
            if(numberOfPrime==20){
                break;
            }
        }
    }
}
