package com.atguigu.interview3.day01;

import lombok.extern.slf4j.Slf4j;

/**
 * @BelongsProject: interview3
 * @BelongsPackage: com.atguigu.interview3.day01
 * @Author: 张世罡
 * @CreateTime: 2022-03-14 16:18
 * @Description:
 */
@Slf4j(topic = "58")
public class StringPool58Demo {
    public static void main(String[] args) {
        String str1 = new StringBuilder("58").append("tongcheng").toString();
        log.info(str1);
        log.info(str1.intern());
        log.info(String.valueOf(str1 == str1.intern())); // true

        log.info("\n");
        System.out.println();

        String str2 = new StringBuilder("ja").append("va").toString();
        log.info(str2);
        log.info(str2.intern());
        log.info(String.valueOf(str2 == str2.intern())); // false
    }
}
