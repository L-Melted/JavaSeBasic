package cn.lm.demo.day07_String类Static关键字Arrays类Math类;

public class demo01_String {
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

        //String底层是被final的char数组

        //字符串常量在jdk1.7版本之后存在于堆内存中的字符串常量池中
        //==用于比较变量的地址（引用）是否相同
        //equals用于比较引用类型堆中对象内容是否相同

        //如果直接定义双引号的字符串那么是在字符串常量池中
        //如果使用构造方法构建对象，那么字符串在普通的堆中


        /**创建字符串对象*/
        String s = "aa|bb|cc";
        String s3 = "itjava123java456";
        String[] javas = s3.split("java");
        String[] split = s.split("\\|");

        for (String s4 : split) {

            System.out.println(s4);
        }

        //正则表达式中有些特殊符号，比如.|+?等，使用分割时要进行
        //转义，直接前面双斜杠就可以\\
    }






}
