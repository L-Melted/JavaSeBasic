package cn.lm.demo1.反射;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 7.反射操作属性
 */
public class FieldDemoTest {

    //类反射操作构造方法
    @Test
    public void getConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Student.class;
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);

        declaredConstructor.setAccessible(true);

        Object o = declaredConstructor.newInstance("liman", 22);
        System.out.println(o);
    }

    //类反射操作方法
    @Test
    public void getMethods() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Student.class;

        Method method = clazz.getDeclaredMethod("method1",int.class);

        method.setAccessible(true);

        method.invoke(clazz.newInstance(),10);

    }

    //类反射操作属性
    @Test
    public void getFields() throws IllegalAccessException, InstantiationException {
        Student student = new Student();
        Class aClass = student.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        declaredFields[0].set(student,"杨幂");
        declaredFields[1].set(student,21);
        System.out.println(student);

        int length = declaredFields.length;
        System.out.println(length);

        Object o = declaredFields[0].get(aClass.newInstance());
        System.out.println(o);

    }



}
