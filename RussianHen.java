package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    public String getDescription(){
        String Sssss = super.RUSSIA;
        int N = getCountOfEggsPerMonth();
        String string = super.getDescription() + " Моя страна - " + Sssss + ". Я несу " + N + " яиц в месяц.";
        return string;

//        <getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
    }
}
