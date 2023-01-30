package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {

        int x = 250;
        int y = 300;

        SqrtService service = new SqrtService();

        int result = service.calcSqrt(x, y);

        System.out.println("Найдено корней: " + result);

    }
}