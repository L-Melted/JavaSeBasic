package cn.lm.demo.day11_final权限内部类引用类型;

public class Final关键字 {

    /**
     * final：不可改变。可以用于修饰类、方法和变量。
     *
     * 1. 类：被修饰的类，不能被继承。
     * 2. 方法：被修饰的方法，不能被重写。
     * 3. 变量：被修饰的变量，不能被重新赋值。
     *         基本类型的局部变量，被final修饰后，只能赋值一次，不能再更改。
     *         引用类型的局部变量，被final修饰后，只能指向一个对象，地址不能再更改。
     *         成员变量涉及到初始化的问题，初始化方式有两种，只能二选一：
     *            显示初始化：
     *            public class User {
     *                  final String USERNAME = "张三";
     *                  private int age;
     *            }
     *            构造方法初始化。(**set方法都不行**)：
     *            public class User {
     *                final String USERNAME ;
     *                private int age;
     *                public User(String username, int age) {
     *                    this.USERNAME = username;
     *                    this.age = age;
     *                }
     *            }
     *          注意：被final修饰的常量名称，一般都有书写规范，所有字母都大写。多个单词之间,使用下划线进行分割
     *
     *
     */


}
