package cn.lm.demo.day08_类与对象封装构造方法;

public class TestStudent {
    public static void main(String[] args) {
        //无参构造使用
        Student student = new Student();
        student.setName("柳岩");
        student.setAge(18);
        System.out.println(student.getName()+"---"+student.getAge());

        //带参构造使用
        Student student1 = new Student("赵丽颖", 18);
        System.out.println(student1.getName()+"----"+student1.getAge());
    }
}
