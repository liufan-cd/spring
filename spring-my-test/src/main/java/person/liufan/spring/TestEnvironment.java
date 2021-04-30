package person.liufan.spring;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import person.liufan.spring.student.service.StudentService;
import person.liufan.spring.student.service.impl.StudentServiceImpl;

import java.util.Arrays;
import java.util.Map;

/**
 * @author: liufan
 * @E-mail: fan.liu@biz-united.com.cn
 * @package: person.liufan.spring
 * @description: TODO
 * @date 2021/4/25
 */
public class TestEnvironment {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        Object first = context.getBean("first");
    }
}
