package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SqrtServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

    public void calcTrue(int expected, int x, int y) {
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(x, y);

        Assertions.assertEquals(expected, actual);

    }
}
