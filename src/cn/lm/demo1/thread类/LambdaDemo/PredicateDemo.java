package cn.lm.demo1.thread类.LambdaDemo;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        method1(str-> str.startsWith("h"),str -> str.length() <3 ,"helloWorld");
    }


    public static void method(Predicate<String> predicate,String str){
        boolean test = predicate.test(str);
        System.out.println(test);
    }

    public static void method1(Predicate<String> predicate1,Predicate<String> predicate2,String str){
        Predicate<String> predicate = predicate1.and(predicate2);

        System.out.println(predicate);
        boolean test = predicate.test(str);
        System.out.println(test);
    }


}
