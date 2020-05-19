package cn.lm.demo1.thread类.LambdaDemo;

import java.util.function.Function;

public class FunctionDemo02 {
    public static void main(String[] args) {
        method(
                (String str)->{return Integer.parseInt(str);},
                (Integer i)->{return i+90;},
                "10"
        );
    }
    public static void method(Function<String,Integer> function1,Function<Integer,Integer> function2,String str){
        /*Integer result1 = function1.apply(str);
        Integer result2 = function2.apply(result1);
        System.out.println(result1);
        System.out.println(result2);*/

        Integer result = function1.andThen(function2).apply(str);
        Integer apply = function2.compose(function1).apply(str);
        System.out.println(apply);
        System.out.println(result);
    }
}
