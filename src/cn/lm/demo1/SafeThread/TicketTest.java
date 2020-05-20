package cn.lm.demo1.SafeThread;

public class TicketTest {

    public static void main(String[] args) {
        TicketTask ticketTask = new TicketTask();

        new Thread(ticketTask,"窗口1").start();
        new Thread(ticketTask,"窗口2").start();
        new Thread(ticketTask,"窗口3").start();
    }
}
