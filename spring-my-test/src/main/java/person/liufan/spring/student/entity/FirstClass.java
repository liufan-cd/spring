package person.liufan.spring.student.entity;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author: liufan
 * @E-mail: fan.liu@biz-united.com.cn
 * @package: person.liufan.spring.student.entity
 * @description: TODO
 * @date 2021/4/29
 */
public class FirstClass implements EnvironmentAware, InitializingBean {
    SecondClass second;
    private Environment environment;
    public SecondClass getSecond() {
        return second;
    }

    public void setSecond(SecondClass second) {
        this.second = second;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public Environment getEnvironment() {
        return environment;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(environment.getProperty("USERNAME"));
    }
}
