package com.ke.jiaoyi.debugging;


/**
 * <div style="font-size: 30;background:#f9f9f9">
 * <div style="font-size: 45;">课后作业 🤛</div><br>
 * <div>请解释为什么以下程序的输出是false</div>
 * <br>
 */
@SuppressWarnings("ALL")
public class 课后作业 {
    public static void main(String[] args) {
        String s1 = "大家好";
        String s2 = "⼤家好";
        System.out.println(s1.equals(s2));
    }
}