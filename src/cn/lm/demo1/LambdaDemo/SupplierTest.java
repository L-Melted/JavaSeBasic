package cn.lm.demo1.LambdaDemo;

import java.util.function.Supplier;

/*
* 16.使用Supplier求数组的最大值
*
* --我需要一个生产者，它要生产出一个最大值，如何实现由lambda表达式去实现
*
* */
public class SupplierTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        method(()->{
            int max = arr[0];
            for (int i : arr) {
                if(i > max){
                    max = i;
                }
            }
            return max;
        });
    }

    public static void method(Supplier<Integer> supplier){
        Integer integer = supplier.get();
        System.out.println(integer);
    }
}
