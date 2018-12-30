package com.imooc.girl.controller;

import com.imooc.girl.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.Main;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hi/{id}", method = RequestMethod.GET)
    public String HelloSpring(@PathVariable(value = "id") Integer id){
//        return cupSize + age;
//        return content;

        return "大家好，这是我的程序： Id " + id;
    }

    //ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 3, 54,5 );
//    CachedThreadPool:可缓存的线程池，该线程池中没有核心线程，非核心线程的数量为Integer.max_value，就是无限大，当有需要时创建线程来执行任务，没有需要时回收线程，适用于耗时少，任务量大的情况。
//
//    SecudleThreadPool:周期性执行任务的线程池，按照某种特定的计划执行线程中的任务，有核心线程，但也有非核心线程，非核心线程的大小也为无限大。适用于执行周期性的任务。
//
//    SingleThreadPool:只有一条线程来执行任务，适用于有顺序的任务的应用场景。
//
//    FixedThreadPool:定长的线程池，有核心线程，核心线程的即为最大的线程数量，没有非核心线程
//---------------------
//    作者：weixin_40271838
//    来源：CSDN
//    原文：https://blog.csdn.net/weixin_40271838/article/details/79998327
//    版权声明：本文为博主原创文章，转载请附上博文链接！

ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2);


    public static void main(String[] args) {
        System.out.println(Math.log(100));
        System.out.println(Math.log10(100));
    }







}
