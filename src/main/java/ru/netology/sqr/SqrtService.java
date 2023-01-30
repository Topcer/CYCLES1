package ru.netology.sqr;

public class SqrtService {
    public int calcSqrt(int x, int y) {

        int result = 0;

        for (int i = 10; i < 100; i++) {
            if ((i * i >= x) && (i * i <= y)) {
                result = result + 1;
            }
        }
        return result;
    }
}
