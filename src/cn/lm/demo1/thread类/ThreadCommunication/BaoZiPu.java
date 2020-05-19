package cn.lm.demo1.thread类.ThreadCommunication;

public class BaoZiPu implements Runnable{
    BaoZi baoZi;

    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        synchronized (baoZi){
            if(baoZi.flag){
                //有包子
                try {
                    baoZi.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                //如果没有包子就做，通知吃货
                baoZi.flag = true;
                System.out.println("包子铺做了一个包子");
                baoZi.notify();

            }


        }
    }
}
