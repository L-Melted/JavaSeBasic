package cn.lm.demo1.thread类.LambdaDemo;

import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        String str = "aBcd";
        method(
                (String s1)->{
            System.out.println(s1.toUpperCase());
        },
                (String s2)->{
            System.out.println(s2.toLowerCase());
        },str);
    }


    public static void method(Consumer<String> consumer1,Consumer<String> consumer2,String str){
//        consumer1.accept(str);
//        consumer2.accept(str);

        consumer1.andThen(consumer2).accept(str);
//        consumer1.andThen(consumer2).andThen(consumer2).accept(str);
    }

}
