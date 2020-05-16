package cn.lm.demoInterview;

import cn.lm.demoInterview.vo.Person;
import org.junit.Test;

public class CloneTest {


    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Person p = new Person(18,"liman");

        Person p1 = (Person)p.clone();

        System.out.println(p);

        System.out.println(p1);




    }
}
