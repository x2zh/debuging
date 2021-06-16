package com.ke.jiaoyi.debugging;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

















/**
 * <div style="font-size: 30;background:#f9f9f9">
 * <div style="font-size: 45;">Java代码调试最佳实践 🤛</div><br>
 *
 * 主讲人：张骁骁 <br>
 * 2021-06-08
 * </div>
 */
@SuppressWarnings("ALL")
public class Java代码调试最佳实践 {


















    /**
     * <div style="font-size: 30;background:#f9f9f9">
     * <div style="font-size: 35;">为什么debug 😳</div>
     * <br><ul>
     * <li>定位和修复bugs!</li>
     * <li>分析现存的代码</li>
     * <li>不重启应用的情况下插入日志</li>
     * <li>不重启应用的情况下改变代码执行流程</li>
     * <li>更多。。。。。</li>
     * </ul>
     * </div>
     */
    int 本地启动应用时请总是打开调试器;























    /**
     * <div style="font-size: 30;background:#f9f9f9">
     *     <div style="font-size: 35;">谢谢观看🙂</div>
     *     <br>
     *     你太凡尔赛了
     * </div>
     */
    int 我从来不写bug所以不用debug;
















    /**
     *
     * <div style="font-size: 30;background:#f9f9f9">
     *     <div style="font-size: 35;">代码调试的基本方法</div>
     *     <br/>
     * <ul>
     *     <li>启动/停止/重启 debugger</li>
     *     <li>挂起/恢复</li>
     *     <li>设置断点/关闭断点/取消断点</li>
     *     <li>单步调试：step over/into/out</li>
     *     <li>变量: 内联、变量表、修改</li>
     *     <li>表达式求值：quick evaluate、求值对话框</li>
     *     <li>watches</li>
     * </ul>
     */
    public static class 代码调试的基本方法 {
        public static void main(String[] args) throws IOException {
            while (true) {
                int read = System.in.read();
                System.out.println("Input " + read);
                if (filter(read)) {
                    process(read);
                }
            }
        }

        private static boolean filter(int read) {
            return read != '\n';
        }

        private static void process(int arg) {
            if (Math.max(arg, 98) % 2 == 0) {
                System.out.println("!");
            }
        }

    }















    /**
     * <div style="font-size: 30;background:#f9f9f9"><div style="font-size: 35;">修改程序的执行流程</div>
     * <br><ul>
     * <li>修改变量</li>
     * <li>丢弃栈帧(Drop frame)</li>
     * <li>&#128142 强制返回(Force return)</li>
     * <li>&#128142 抛出异常(Throw exception)</li>
     * <li>热更新代码</li>
     * </ul>
     * @see 改变程序的执行流 改变程序的执行流;
     */
    float 你真的会单步调试的技巧吗;















    /**
     * <div style="font-size: 30;background:#f9f9f9"><div style="font-size: 35;">调试Lambdas</div>
     * <br>
     * <ul>
     * <li>&#128142 Breakpoints in lambdas</li>
     * <li>&#128142 Run to cursor in lambda</li>
     * <li>&#128142 Step into lambdas</li>
     * <li>&#128577 Lambda class/method name is not specified</li>
     * </ul>
     */
    public static class Lambdas {
        public static void main(String[] args) {
            Object[] res = Stream.of(1, 2, 3, 4, 5, 6).filter(i -> i % 2 == 0).filter(x -> x > 3).peek(k -> { }).toArray();
            System.out.println(Arrays.toString(res));
        }
    }
























    /**
     * <div style="font-size: 30;background:#f9f9f9"><div style="font-size: 35;">&#128142 Stream 调试器</div>
     * <br>
     */
    public static class StreamDebugger {
        public static void main(String[] args) {
            int[] result = IntStream.of(10, 87, 97, 43, 121, 20)
                    .flatMap(StreamDebugger::factorize)
                    .distinct()
                    .sorted()
                    .toArray();
            System.out.println(Arrays.toString(result));
        }

        private static IntStream factorize(int value) {
            List<Integer> factors = new ArrayList<>();
            for (int i = 2; i <= value; i++) {
                while (value % i == 0) {
                    factors.add(i);
                    value /= i;
                }
            }
            return factors.stream().mapToInt(Integer::intValue);
        }
    }



























    /**
     * <div style="font-size: 30;background:#f9f9f9"><div style="font-size: 35;">如何调试多线程应用</div>
     * @see 一个简单的多线程程序 一个简单的多线程程序
     * <br>
     */
    public static class 多线程调试 {

    }
















    /**
     * <div style="font-size: 30;background:#f9f9f9"><div style="font-size: 35;">如何调试测试环境的应用 😎</div>
     * @see 一个简单的WEB应用 一个简单的WEB应用
     * <br>
     */
    int 远程调试;











    /**
     * <div style="font-size: 30;background:#f9f9f9"><div style="font-size: 35;">如何调试生产环境的应用 😑</div>
     * <br>
     * <ul>
     * <li>arthas</li>
     * </ul>
     *
     */
    int 线上调试;















    /**
     * <div style="font-size: 30;background:#f9f9f9"><div style="font-size: 35;">谢谢大家</div>
     * <br>
     */
    int questions;
}






