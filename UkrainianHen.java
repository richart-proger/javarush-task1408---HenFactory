package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 70;
    }

    @Override
    public String getDescription() {
        String Sssss = super.UKRAINE;
        int N = getCountOfEggsPerMonth();
        String string = super.getDescription() + " Моя страна - " + Sssss + ". Я несу " + N + " яиц в месяц.";
        return string;
    }
}
