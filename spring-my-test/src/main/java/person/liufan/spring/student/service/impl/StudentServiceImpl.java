package person.liufan.spring.student.service.impl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Service;
import person.liufan.spring.student.entity.StudentEntity;
import person.liufan.spring.student.service.StudentService;

/**
 * @author: liufan
 * @E-mail: fan.liu@biz-united.com.cn
 * @package: person.liufan.spring.student.service.impl
 * @description: TODO
 * @date 2021/4/25
 */
@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {
    public String identify = "studentServiceImpl";
    @Override
    public String getName() {
        return new StudentEntity().getName();
    }

    public StudentServiceImpl(String identify) {
        this.identify = identify;
    }

    public StudentServiceImpl() {
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }
}
