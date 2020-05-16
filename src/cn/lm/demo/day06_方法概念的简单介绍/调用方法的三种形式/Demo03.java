package cn.lm.demo.day06_方法概念的简单介绍.调用方法的三种形式;

public class Demo03 {
    public static void main(String[] args) {
        //1.直接调用:直接写方法名调用
        print();

        //2.赋值调用
        int sum = getSum(5, 6);
        System.out.println(sum);

        //3.输出语句调用（打印调用）：有返回值类型的方法
        System.out.println(getSum(5, 6));


        //总结：
        // 有返回值方法：赋值调用，输出语句调用，可以直接调用但是无法接收返回值
        //无返回值方法：直接调用
    }

    public static void print(){
        System.out.println("方法被调用");
    }

    public static int getSum(int a ,int b){
        return a+b;
    }

    public static int getSum1(int a,int b){
        return a+b;
    }


}
