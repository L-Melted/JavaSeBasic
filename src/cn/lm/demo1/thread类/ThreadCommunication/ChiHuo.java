package cn.lm.demo1.thread类.ThreadCommunication;

public class ChiHuo implements Runnable{
    BaoZi baoZi;

    public ChiHuo(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        synchronized (baoZi){
            if(baoZi.flag){
                //如果有包子就吃，吃完通知包子铺
                baoZi.flag = false;
                System.out.println("吃货吃了一个包子");
                baoZi.notify();
            }else{
                //没有包子
                try {
                    baoZi.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }



        }

    }
}
