package com.zhg.java8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

class PythagoreanNumsTest {

    private PythagoreanNums pythagoreanNums;
    private int from;
    private int to;
    private List<double[]> pythagoreanList;

    @BeforeEach
    void setUp() {
        pythagoreanNums = new PythagoreanNums();
        from = 1;
        to = 100;
    }

    @AfterEach
    void tearDown() {
        pythagoreanList.stream()
                .map(t -> new String[]{String.valueOf((int) t[0]), String.valueOf((int) t[1]), String.valueOf((int) t[2])})
                .forEach(t -> System.out.println(Arrays.stream(t).collect(joining(", ", "(", ")"))));
    }

    @Test
    void generate() {
        pythagoreanList = pythagoreanNums.generate(from, to);
        pythagoreanList.stream()
                .map(t -> new String[]{String.valueOf((int) t[0]), String.valueOf((int) t[1]), String.valueOf((int) t[2])})
                .forEach(t -> System.out.println(Arrays.stream(t).collect(joining(", ", "(", ")"))));
    }

    @Test
    void generat2() {
        pythagoreanList = pythagoreanNums.generate2(from, to);
    }
}