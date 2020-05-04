package com.bl.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

    private Heart heart;

    @Autowired
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Human(){

    }

    public Human(Heart heart) {
        this.heart = heart;
    }

    public void startPumping(){
        if (heart != null) {
            heart.pump();
        }
        else {
            System.out.println("You are dead! ");
        }
    }
}
