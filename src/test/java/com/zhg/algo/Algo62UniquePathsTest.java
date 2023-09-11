package com.zhg.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Algo62UniquePathsTest {
    Algo62UniquePaths algo62UniquePaths = new Algo62UniquePaths();

    @Test
    void uniquePaths() {
        int paths = algo62UniquePaths.uniquePaths(3, 7);

        Assertions.assertEquals(28, paths);
    }

    @Test
    void uniquePaths2() {
        int paths = algo62UniquePaths.uniquePaths2(3, 7);

        Assertions.assertEquals(28, paths);
    }
}