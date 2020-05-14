package cn.lm.demo1.thread类;

public class MyThreadDemoTest {

    public static void main(String[] args) {
        System.out.println("这里是main线程");
        MyThreadDemo mt = new MyThreadDemo("小强");
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("旺财："+i);
        }
    }
}
