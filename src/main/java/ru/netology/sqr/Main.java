package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {

        int first = 250;
        int second = 300;

        SqrtService service = new SqrtService();

        int result = service.calcSqrt(first, second);

        System.out.println("Найдено корней: " + result);

    }
}