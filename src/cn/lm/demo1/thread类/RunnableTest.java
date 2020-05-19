package cn.lm.demo1.thread类;

public class RunnableTest {
    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();

        Thread thread = new Thread(runnableDemo,"线程1");

        thread.start();



        for (int i = 0; i < 100; i++) {
            System.out.println("Hello PHP");
        }
        Thread thread1 = Thread.currentThread();

        System.out.println("目前是线程2 ： "+thread1.getName());
        System.out.println(
                "线程结束！！！"
        );

    }

}
