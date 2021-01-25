package com.javarush.task.task14.task1408;

public abstract class Hen implements Country{
    public abstract int getCountOfEggsPerMonth();

    public String getDescription(){
        String string = "Я - курица.";
        return string;
    }
}
