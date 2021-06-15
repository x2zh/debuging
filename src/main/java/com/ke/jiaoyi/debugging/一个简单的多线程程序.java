package com.ke.jiaoyi.debugging;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


















/**
 * <div style="font-size: 30;background:#f9f9f9">
 * <div style="font-size: 45;">多线程应用调试 🤛</div><br>
 * <ul>
 * <li>断点挂起所有线程</li>
 * <li>断点挂起当前线程</li>
 * </ul>
 */
@SuppressWarnings("NonAsciiCharacters")
public class 一个简单的多线程程序 {
    static class LazyNonDoubleCheckSingleton {

        private LazyNonDoubleCheckSingleton() {
            System.out.println("讲师初始化完毕");
        }

        public void greet() {
            System.out.println("欢迎大家参加《Java代码调试最佳实践》课程");
        }

        private static volatile LazyNonDoubleCheckSingleton instance;

        public static LazyNonDoubleCheckSingleton getInstance() {
            if (instance == null) {
                synchronized (LazyNonDoubleCheckSingleton.class) {
                    instance = new LazyNonDoubleCheckSingleton();
                }
            }
            return instance;
        }
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable r = () -> {
            LazyNonDoubleCheckSingleton instance = LazyNonDoubleCheckSingleton.getInstance();
            instance.greet();
        };

        Future<?> f1 = executorService.submit(r);
        Future<?> f2 = executorService.submit(r);
        f1.get();
        f2.get();
        executorService.shutdown();
    }
}
