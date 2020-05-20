package cn.lm.demo1.thread类.YinYong;

public class YinYongTest {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();

        method((String str)->{
            myClass.printStr(str);
            System.out.println(str.toUpperCase());
        },"Hello World");

        method(str->myClass.printStr(str),"Hello World");

    }

    public static void method(Printable printable,String str){
        //打印对应的字符串的大写
        printable.printString(str);
    }


}
