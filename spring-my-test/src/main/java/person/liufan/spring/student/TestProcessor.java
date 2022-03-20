package person.liufan.spring.student;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import person.liufan.spring.student.entity.FirstClass;

/**
 * @author: liufan
 * @E-mail: fan.liu@biz-united.com.cn
 * @package: person.liufan.spring.student
 * @description: TODO
 * @date 2021/5/6
 */
@Component
public class TestProcessor implements BeanPostProcessor {
    private static final String BEAN_NAME = "first";
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals(BEAN_NAME)) {
            System.out.println("==========================");
            System.out.println(bean);
            System.out.println("==========================");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
