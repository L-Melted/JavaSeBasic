package cn.lm.demo1.LambdaDemo;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        //我想获取一个字符串
        method(()->"woshi");

    }

    //定义出一个方法，接收Supplier接口作为参数，打印出我们想要的结果
    public static void method(Supplier supplier){
        Object o = supplier.get();
        System.out.println(o);
    }




}
