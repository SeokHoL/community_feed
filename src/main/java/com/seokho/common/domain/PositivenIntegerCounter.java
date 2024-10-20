package com.seokho.common.domain;

public class PositivenIntegerCounter {

    private int count;

    public PositivenIntegerCounter() {
        this.count =0;
    }

    public void increase(){
        this.count++;
    }
    public void decrease(){
        if(this.count <= 0){
            return;
        }
        this.count--;
    }

    public int getCount() {
        return count;
    }
}
