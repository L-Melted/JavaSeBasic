package cn.lm.demo.String类Static关键字Arrays类Math类;

public class demo01 {
    public static void main(String[] args) {
        //字符串时引用类型
        //str1存的是”abc“这个字符串在内存中的地址（地址就是一个数字）
        String str1 = "abc";

        //str2存的是str1和”def“拼接后 字符串”abcdef“在内存中地址
        String str2 = str1 + "def";

        //猜想：
        System.out.println(str1 == str2);
        System.out.println(str1);
        System.out.println(str2);

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2);

        //String底层是靠字符数组实现的。在1.8以前的版本，这是字符串内部实现原理


    }






}
