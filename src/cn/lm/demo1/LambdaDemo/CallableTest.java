package cn.lm.demo1.LambdaDemo;

import java.util.concurrent.*;

public class CallableTest {
    /*
    * 我们能不能获取到线程执行的结果呢？  callable接口
    *
    * <T> Future<T> submit(Callable<T> task) 提交值返回任务以执行，并返回代表任务待处理结果的Future。
    *
    * 总结:当我们要获取一个线程执行完毕之后的最终的结果时，就必须使用Callable接口，submit(Callable<T> task)
    *
    *
    *
    * */

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.创建线程池对象
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
                return "这是callable任务得到的返回值";
            }
        };
        Future<String> future1 = threadPool.submit(callable);
        System.out.println(future1.get());

        //3.执行完毕，可以关闭线程池
        threadPool.shutdown();//一


    }



}
