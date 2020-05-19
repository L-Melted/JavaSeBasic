package cn.lm.demo1.thread类.SafeThread;

public class TicketTask implements Runnable{


    int ticketNum = 100;

    Object lock = new Object();

    @Override
    public void run() {

        while(true){
            synchronized (lock){
               if(ticketNum > 0){
                   System.out.println("目前线程"+Thread.currentThread().getName()+"正在卖第"+ticketNum+"票");
                   ticketNum--;
               }
            }
        }
    }
}
