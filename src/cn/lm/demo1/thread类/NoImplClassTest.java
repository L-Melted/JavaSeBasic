package cn.lm.demo1.thread类;

public class NoImplClassTest {

    public static void main(String[] args) {
        //方式一：继承Thread类
        new Thread("线程1"){
            @Override
            public void run() {
                System.out.println("正在运行的线程名称 ： "+Thread.currentThread().getName());
            }
        }.start();


        //方式二：实现runnable接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("正在运行的线程名称 ： "+Thread.currentThread().getName());
            }
        }).start();


    }
}
