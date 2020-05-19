package cn.lm.demo1.thread类;

public class RunnableDemo  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello java");
        }
        Thread thread1 = Thread.currentThread();

        System.out.println("目前是线程1 ： "+thread1.getName());
    }
}
