package person.liufan.spring.reflect;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: liufan
 * @E-mail: fan.liu@biz-united.com.cn
 * @package: person.liufan.spring.reflect
 * @description:
 * 测试我的自动注入注解
 * @date 2021/6/8
 */
@Component
public class Car {
    @Value("myCar")
    private String name;
    @MyAutowired
    private Door door;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", door=" + door +
                '}';
    }
}
