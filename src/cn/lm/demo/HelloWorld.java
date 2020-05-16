package cn.lm.demo;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("HelloWorld!!!");
        List<String> list= new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String y = list.get(list.size()-1);
            System.out.println(y);
            String x = list.get(i);
            if(x.equals("6")){
                list.remove(i);
                i--;
                continue;
            }
            if(x.equals("5")){
                list.remove(i);
                i--;
                continue;
            }
            if(x.equals("2")){
                list.remove(i);
                i--;
                continue;
            }

        }


//
//        for (String x : list) {
//            boolean remove = false;
//            if(x.equals("6")){
//                remove = list.remove(x);
//            }
//            if(!remove){
//                System.out.println("item="+x);
//            }
//            System.out.println(list);
//        }

//        list.stream().forEach(x -> {
//            boolean remove = false;
//            if(x.equals("6")){
//                remove = list.remove(x);
//            }
//            if(!remove){
//                System.out.println("item="+x);
//            }
//            System.out.println(list);
//        });

        System.out.println(list);




    }
}
