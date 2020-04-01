package cn.lm.demo.day08_类与对象封装构造方法.成员变量和方法;

public class Test02Phone {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();

        //输出成员变量值
        System.out.println("品牌："+p.brand);//null
        System.out.println("价格："+p.price);//0
        System.out.println("颜色："+p.color);//null
        System.out.println("--------------");

        //给成员变量赋值
        p.brand = "锤子";
        p.price = 299990;
        p.color = "棕色";

        //再次输出成员变量值
        System.out.println("品牌："+p.brand);//锤子
        System.out.println("价格："+p.price);//299990
        System.out.println("颜色："+p.color);//棕色
        System.out.println("--------------");


        //调用成员方法
        p.call("紫霞");
        p.sendMessage();

        /**
         * 小结：在栈内存中运行的方法，遵循“先进后出，后进先出”的原则。变量p
         * 指向堆内存中的空间，寻找方法信息，去执行该方法。
         *
         * 但是，值得注意的是，方法并非在堆内存中，而在方法区中。堆中对象实体拥有方法
         * 区中方法的标记（即该方法的地址）。对象调用方法时，根据对象中方法标记（地址值），
         * 去类中寻找方法信息。这样哪怕多个对象，方法信息只保存一份，节约内存空间。
         *
         * 引用类型作为参数，传递的是地址值。
         *
         * */


    }




}


