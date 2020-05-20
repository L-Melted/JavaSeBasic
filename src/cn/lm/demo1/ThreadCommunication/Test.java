package cn.lm.demo1.ThreadCommunication;

public class Test {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();

        BaoZiPu baoZiPu = new BaoZiPu(baoZi);
        new Thread(baoZiPu).start();

        ChiHuo chiHuo = new ChiHuo(baoZi);
        new Thread(chiHuo).start();



    }
}
