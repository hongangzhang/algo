package com.zhg.algo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeNum_15Test {

    @Test
    void threeSum() {
        ThreeNum_15 threeNum_15 = new ThreeNum_15();
        List<List<Integer>> threeSumList = threeNum_15.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        threeSumList.stream().forEach(System.out::println);
    }
}