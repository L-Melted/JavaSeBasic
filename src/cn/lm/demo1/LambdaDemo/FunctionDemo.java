package cn.lm.demo1.LambdaDemo;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        method((String str)->{
            return Integer.parseInt(str);
        },"100");
    }


    public static void method(Function<String,Integer> function ,String str){
        Integer apply = function.apply(str);
        System.out.println(apply);
    }
}
