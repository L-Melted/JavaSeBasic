package cn.lm.demo1.thread类.LambdaDemo;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        method((String str)->{
            System.out.println(str.toUpperCase());
        },"aBcd");
    }

    public static void method(Consumer<String> consumer ,String str){
        consumer.accept(str);
    }
}
