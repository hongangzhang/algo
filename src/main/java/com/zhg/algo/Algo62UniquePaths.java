package com.zhg.algo;

/**
 * 62. 不同路径
 * 题目链接：https://leetcode.cn/problems/unique-paths/
 * 题目：
 * 1 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * 2 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * 3 问总共有多少条不同的路径？
 *
 * @author zhanghongang
 * @date 2023/09/10
 */
public class Algo62UniquePaths {

    /**
     * 不同路径
     * 解法：递归
     *
     * @param m 网格的宽度
     * @param n 网格的长度
     * @return int
     */
    public int uniquePaths(int m, int n) {
        // 参数校验
        if (m < 1 || n < 1) {
            return -1;
        }

        if (m == 1 || n == 1) {
            return 1;
        }

        return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    }

    /**
     * 不同路径
     * 解法：循环
     *
     * @param m 网格的宽度
     * @param n 网格的长度
     * @return int
     */
    public int uniquePaths2(int m, int n) {
        // 参数检查
        if (m < 1 || n < 1) {
            return -1;
        }

        int[][] uniquePathsNumArray = new int[m][n];

        // 第一行置为1
        for (int i = 0; i < m; i++) {
            uniquePathsNumArray[i][0] = 1;
        }

//        printTwoDArray(uniquePathsNumArray);

        // 第一列置为1
        for (int i = 0; i < n; i++) {
            uniquePathsNumArray[0][i] = 1;
        }

//        printTwoDArray(uniquePathsNumArray);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                uniquePathsNumArray[i][j] = uniquePathsNumArray[i-1][j] + uniquePathsNumArray[i][j-1];
            }
        }

//        printTwoDArray(uniquePathsNumArray);

        return uniquePathsNumArray[m-1][n-1];
    }

    public static void printTwoDArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // 在每行结束时换行
        }
    }
    
}
