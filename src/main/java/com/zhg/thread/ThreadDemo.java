package com.zhg.thread;

/**
 * ??demo
 *
 * @author zhanghongang
 * @date 2023/04/10
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("threadStatus:" + myThread.getState());
        myThread.start();
    }

    public static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("MyThread");
        }
    }
}
