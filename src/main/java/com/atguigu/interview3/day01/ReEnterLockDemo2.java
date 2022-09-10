package com.atguigu.interview3.day01;

/**
 * @BelongsProject: interview3
 * @BelongsPackage: com.atguigu.interview3.day01
 * @Author: 张世罡
 * @CreateTime: 2022-03-14 22:48
 * @Description:
 */
public class ReEnterLockDemo2 {
    public static void main(String[] args) {
        new ReEnterLockDemo2().m1();
    }

    private synchronized void m1() {
        System.out.println("===== 外");
        m2();
    }

    private synchronized void m2() {
        System.out.println("===== 中");
        m3();
    }

    private synchronized void m3() {
        System.out.println("===== 内");
    }

}
