package person.liufan.spring.reflect;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: liufan
 * @E-mail: fan.liu@biz-united.com.cn
 * @package: person.liufan.spring.reflect
 * @description:
 * 自动注入的车门
 * @date 2021/6/8
 */
@Component
public class Door {
    @Value("myDoor")
    private String name;

    @Override
    public String toString() {
        return "Door{" +
                "name='" + name + '\'' +
                '}';
    }
}
