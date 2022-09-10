package com.atguigu.interview3.day01;

/**
 * @BelongsProject: interview3
 * @BelongsPackage: com.atguigu.interview3.day01
 * @Author: 张世罡
 * @CreateTime: 2022-03-14 22:43
 * @Description:
 */
public class ReEnterLockDemo {

    static Object objectLockA = new Object();

    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        new Thread(() -> {
            synchronized (objectLockA) {
                System.out.println(Thread.currentThread().getName() + "\t" + "---- 外层调用");
                synchronized (objectLockA) {
                    System.out.println(Thread.currentThread().getName() + "\t" + "---- 中层调用");
                    synchronized (objectLockA) {
                        System.out.println(Thread.currentThread().getName() + "\t" + "---- 内层调用");

                    }
                }
            }
        }, "t1").start();
    }
}
