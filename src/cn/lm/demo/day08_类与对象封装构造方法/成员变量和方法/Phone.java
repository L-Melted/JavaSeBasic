package cn.lm.demo.day08_类与对象封装构造方法.成员变量和方法;
/*
* 定义手机类
* */
public class Phone {
    //    成员变量
    String brand;//品牌
    int price;//价格
    String color;//颜色

    //      成员方法
    //打电话
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    //发短信
    public void sendMessage(){
        System.out.println("群发短信");
    }


    //      局部变量
    public  void drive(){
        int speed = 80;
        System.out.println("时速："+speed);
    }


    /**
     * 成员变量和局部变量的区别：
     *     在类中的位置不同：局部变量在方法中或者方法声明上（形式参数），
     *                    成员变量在类中，方法外
     *     作用范围不同：局部变量作用在方法中，成员变量在类中
     *     初始化值的不同：局部变量没有默认值。必须先定义，赋值，最后使用
     *                  成员变量有默认值
     *     在内存中的位置不同：局部变量在栈内存中，成员变量在堆内存中
     *     声明周期不同：局部变量随着方法的调用而存在，随着方法的调用完毕而消失
     *                 成员变量随着对象的创建而存在，随着对象的消失而消失
     *
     *
     * */



}
