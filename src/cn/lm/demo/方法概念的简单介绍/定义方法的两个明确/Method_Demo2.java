package cn.lm.demo.方法概念的简单介绍.定义方法的两个明确;

public class Method_Demo2 {
    /**
     * 定义方法的两个明确：
     * 1.明确返回值类型
     * 2.明确参数列表
     * */
    public static void main(String[] args) {
        int sum = getSum(1,22);
        System.out.println(sum);
    }

    /*
    * 定义计算两个整数和的方法
    * 返回值类型，计算结果是int
    * 参数：不确定数据求和，定义Int参数，参数又称为形式参数
    * */

    public static int getSum(int a,int b){
        return a+b;
    }



}
