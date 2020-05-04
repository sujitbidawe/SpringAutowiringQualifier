package com.bl.autowire;

public class Heart {

    public String nameOfAnimal;
    private int numOfHeart;

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getNumOfHeart() {
        return numOfHeart;
    }

    public void setNumOfHeart(int numOfHeart) {
        this.numOfHeart = numOfHeart;
    }

    public void pump(){
        System.out.println("Your heart is pumping");
        System.out.println("Alive");
    }
}
