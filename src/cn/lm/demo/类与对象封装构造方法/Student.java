package cn.lm.demo.类与对象封装构造方法;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /**
     * this的含义：
     *      this代表所在类的当前对象的引用（地址值），即对象自己的引用
     *      方法被哪个对象调用，方法中的this就代表那个对象。即谁在调用，this就代表谁。
     * 作用：区分同名的局部变量和成员变量
     *
     *
     * 什么是构造方法？
     *     构建对象的时候，给成员变量初始化值得方法。
     *     当一个对象被创建的时候，构造方法用来初始化该对象，给对象的成员变量赋初始值
     *
     *      无论你是否自定义构造方法，所有的类都有构造方法，因为Java自动提供了一个无参数
     *      构造方法，一旦自己定义了构造方法，java自动提供的默认无参数构造方法就会失效。
     *
     * */
}
