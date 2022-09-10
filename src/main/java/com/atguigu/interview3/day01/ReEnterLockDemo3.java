package com.atguigu.interview3.day01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @BelongsProject: interview3
 * @BelongsPackage: com.atguigu.interview3.day01
 * @Author: 张世罡
 * @CreateTime: 2022-03-14 22:43
 * @Description:
 */
public class ReEnterLockDemo3 {

    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        new Thread(() -> {
            lock.lock();
            try {
                System.out.println("===== 外层");
                lock.lock();
                try {
                    System.out.println("===== 内层");
                } finally {
                    lock.unlock();
                }
            } finally {
                lock.unlock();
            }
        }, "t1").start();

        new Thread(() -> {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "\t" + " ----- 调用开始");
            } finally {
                lock.unlock();
            }
        }, "t2").start();
    }
}
