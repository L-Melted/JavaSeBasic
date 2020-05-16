package cn.lm.demo.day11_final权限内部类引用类型;

public class 内部类 {
/**
 * 内部类：
 * 访问特点：
 * 1.从内到外的访问:内部类可以直接访问外部类的成员，包括私有成员。
 * 2.从外到内的访问:外部类访问内部类的成员，必须要先建立内部类的对象后访问
 *   不管是内部类还是外部类,其成员的访问都是基于对象访问的
 *
 *   注意: 如果存在重名情况“就近原则”访问
 * 		内部类局部变量 < 内部类成员变量  <  外部类成员变量
 * 		直接访问	  	|	 this.变量名	  |  外部类名.this.变量名
 *
 * 	局部内部类：
 * 	在方法中也可以定义类,  这个类称为局部内部类.  和变量一样理解,  在方法中的变量为局部变量.
 * 	只能在局部内部类**所在方法中访问.
 * 	从外到内:局部内部类只能在其所在方法范围内访问,  和局部变量一样.  而且同样需要创建对象.
 *  从内到外:局部内部类如果要使用所在方法的局部变量，那么这个局部变量必须是【有效final的】。
 */



 // 外部类

    public void methodOuter() { // 外部类的方法
        final int num = 100; // 外部类方法的局部变量
//        num = 2;
        class LocalInner { // 局部内部类

            public void methodInner() { // 局部内部类方法

                System.out.println("内部类的方法执行！");
                System.out.println(num);
                System.out.println(100);
            }
        }

        new LocalInner().methodInner();
    } // methodOuter

    public void methodOuterAnother() {
        // new LocalInner(); // 错误写法！局部内部类不能在它所在方法外访问.
    }


    public static void main(String[] args) {
         /*
       	创建匿名内部类,直接传递给showFly(FlyAble f)
        */
        showFly( new FlyAble(){
            @Override
            public void fly() {
                System.out.println("我飞了~~~");
            }
        });


        /*
        1.等号右边:是匿名内部类，定义并创建该接口的子类对象
        2.等号左边:是多态赋值,接口类型引用指向子类对象
        */
        new FlyAble(){
            @Override
            public void fly() {
                System.out.println("我飞了~~~");
            }
        }.fly();
    }
    public static void showFly(FlyAble f) {
        f.fly();
    }

}
