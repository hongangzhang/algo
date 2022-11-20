package com.zhg.java8;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * 勾股数
 *
 * @author zhanghongang
 * @date 2022/11/18
 */
public class PythagoreanNums {

    /**
     * 生成生成勾股数对
     *
     * @param from 开始数字，需要大于等于1
     * @param to   结束数字，需要大于等于1
     * @return {@link List}<{@link int[]}>
     */
    public List<double[]> generate(int from, int to) {
        if (from < 1 || to < 1) {
            return null;
        }

        return IntStream.rangeClosed(from, to).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, to)
                        .mapToObj(b -> new double[]{a, b, Math.sqrt(a * a + b * b)})
                        .filter(t -> t[2] % 1 == 0))
                .collect(toList());
    }

    /**
     * 生成勾股数对
     *
     * @param from 开始数字，需要大于等于1
     * @param to   结束数字，需要大于等于1
     * @return {@link List}<{@link int[]}>
     */
    public List<double[]> generate2(int from, int to) {
        if (from < 1 || to < 1) {
            return null;
        }

        return IntStream.rangeClosed(from, to).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, to)
                        .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                        .mapToObj(b -> new double[]{a, b, (int) Math.sqrt(a * a + b * b)}))
                .collect(toList());
    }

}
