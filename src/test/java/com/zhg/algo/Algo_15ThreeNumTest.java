package com.zhg.algo;

import org.junit.jupiter.api.Test;

import java.util.List;

class Algo_15ThreeNumTest {

    @Test
    void threeSum() {
        Algo15ThreeNum algo_15ThreeNum = new Algo15ThreeNum();
        List<List<Integer>> threeSumList = algo_15ThreeNum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        threeSumList.stream().forEach(System.out::println);
    }
}