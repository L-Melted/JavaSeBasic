package cn.lm.demo1.thread类.StreamDemo;

import java.util.ArrayList;
import java.util.List;

public class DemoForeach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.stream().filter(str->str.startsWith("张"))
                     .filter((str->str.length() == 3))
                     .forEach(str->
                            System.out.println(str)
                     );
    }
}
