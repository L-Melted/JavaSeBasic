package cn.lm.demo1.StreamDemo;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        Set<String> list = new HashSet<>();

        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        Stream<String> stream = list.stream();
        Object[] objects = stream.toArray();
        System.out.println(Arrays.toString(objects));


    }

}
