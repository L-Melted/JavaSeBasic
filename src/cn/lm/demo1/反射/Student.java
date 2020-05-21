package cn.lm.demo1.反射;

public class Student {
    String name;
    int age;

    public Student() {
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public void method(){
        System.out.println("无参的public方法method被调用了！！！");
    }

    public void method(int i){
        System.out.println("有参的public方法method被调用了！！！");
    }

    private void method1(int i){
        System.out.println("有参的private方法method被调用了！！！");
    }
}
