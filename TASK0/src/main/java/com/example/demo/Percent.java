package com.example.demo;

public class Percent {
    private float sum;

    public void setSum(float sum) {
        this.sum = sum;
    }

    public float getSum() {
        return sum;
    }

    float countPr(int pr){
        return sum * pr/100;
    }
    float countSum(int pr){
        return sum + countPr(pr);
    }
    int countSumrnd(int pr){
        return Math.round(countSum(pr));
    }

}
