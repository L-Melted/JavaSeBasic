package cn.lm.demo.day06_方法概念的简单介绍.方法重载;

public class Demo03 {


    /**
     * 方法重载：
     * 1.指在同一个类中，允许存在一个以上的同名方法，
     * 只要它们的参数列表中类型或个数不同即可，与修饰符和返回值类型无关
     * （同名不同参）跟形参变量名没有关系
     * 参数列表：个数不同，数据类型不同，顺序不同（与形参的名字无关）
     * 重载方法调用：JVM通过方法的参数列表，调用不同的方法
     * */
    public static void main(String[] args) {
        //定义不同数据类型的变量
        byte a = 10;
        byte b = 20;
        short c = 10;
        short d = 20;
        int e = 10;
        int f = 10;
        long g = 10;
        long h = 20;

        //调用
        System.out.println(compare(a,b));

        System.out.println(compare(c,d));

        System.out.println(compare(e,f));

        System.out.println(compare(g,h));
    }

    //两个byte类型的
    public static boolean compare(byte a, byte b){
        System.out.println("====byte====");
        return a == b;
    }

    //两个short类型的
    public static boolean compare(short a,short b){
        System.out.println("====short====");
        return a == b;
    }

    //两个int类型的
    public static boolean compare(int a,int b){
        System.out.println("====int====");
        return a == b;
    }

    //两个long类型的
    public static boolean compare(long a,long b){
        System.out.println("====long====");
        return a == b;
    }

}
