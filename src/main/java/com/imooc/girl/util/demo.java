package com.imooc.girl.util;

import java.util.Timer;
import java.util.TimerTask;

public class demo {

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new Timer01(), 1000, 1000);
        timer.schedule(new Timer02(), 2000, 1);

    }

    static class Timer01 extends TimerTask{
        @Override
        public void run(){
            System.out.println("aaa---------------");
        }
    }

    static class Timer02 extends TimerTask{
        @Override
        public void run(){
            System.err.println("bbbbbb---------------");
        }
    }
}
