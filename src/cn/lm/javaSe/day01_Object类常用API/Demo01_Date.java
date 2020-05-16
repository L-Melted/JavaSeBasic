package cn.lm.javaSe.day01_Object类常用API;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01_Date {
    public static void main(String[] args) {
        newDate();


        /**
         * 1.DataFormat是日期/时间格式化子类的抽象类，我们通过这个类可以帮我们完成日期和文本之间的转化，
         *   也就是可以在Date对象与String对象之间进行来回转化
         *
         *   格式化：按照指定的格式。从date对象转换成String对象
         *   解析：按照指定的格式，从String 对象转化为date对象
         *
         *
         *   由于DateFormat为抽象类，不能直接使用，所以需要常用的子类SimpleDateFormat.这个类需要一个模式（格式）来指定格式化或解析的标准
         *   public SimpleDateFormat(String pattern):用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat
         *
         *   DateFormat类的常用方法有：
         *   public String format(Date date):将Date对象格式化为字符串
         *   public Date parse(String source):将字符串解析为Date对象
         *
         *
         *
         *
         */
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        String str = "2018-09-07";
        try {
            Date parse = simpleDateFormat.parse(str);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }

    private static void newDate() {
        //1.创建日期对象，打印出当前的日期时间
        System.out.println(new Date());

        //2.创建日期对象，把当前的毫秒值转成日期对象
        System.out.println(new Date(0));

        //3.public long getTime() 把日期对象转换成对应的时间毫秒值
        System.out.println(new Date().getTime());

        //4.直接打印出当前时间的毫秒值
        System.out.println(System.currentTimeMillis());
    }


}
