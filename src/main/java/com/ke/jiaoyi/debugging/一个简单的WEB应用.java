package com.ke.jiaoyi.debugging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * <div style="font-size: 30;background:#f9f9f9">
 * <div style="font-size: 45;">WEB应用调试 🤛</div><br>
 * <ul>
 * <li>😥 默认挂起整个应用 </li>
 * <li>😥 只挂起某个接口的处理线程</li>
 * <li>😊 只挂起一个某请求的处理线程</li>
 * <li>😋 精准的挂起某一请求的处理线程</li>
 * </ul>
 * </div>
 */
@SuppressWarnings("NonAsciiCharacters")
@SpringBootApplication
public class 一个简单的WEB应用 {
    public static void main(String[] args) {
        SpringApplication.run(一个简单的WEB应用.class);
    }


    @RestController
    public static class IndexController {
        @RequestMapping("/")
        public String greet( @RequestParam(name = "name", required = false) String name) {
            return "hello, " + name;
        }


        @RequestMapping("/logout")
        public String bye() {
            return "bye";
        }
    }
}
