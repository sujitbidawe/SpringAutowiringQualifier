package com.bl.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;

//    public void setHeart(Heart heart) {
//        this.heart = heart;
//        System.out.println("setter method called");
//    }
//
//    public Human(){
//
//    }
//
//    public Human(Heart heart) {
//        this.heart = heart;
//        System.out.println("human constructor is called which has heart as arg");
//    }

    public void startPumping(){
        if (heart != null) {
            heart.pump();
            System.out.println("name of animal: " + heart.getNameOfAnimal() +
                                ", number of hearts: " + heart.getNumOfHeart());
        }
        else {
            System.out.println("You are dead! ");
        }
    }
}
