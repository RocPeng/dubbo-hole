package com.ambition.service.core;

import com.ambition.model.Chinese;
import com.ambition.service.api.PersonService;
import org.springframework.stereotype.Service;

/**
 * Created by caoti on 2017/11/10.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 这个世界每天都有太多遗憾,所以你好,再见!
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public Chinese getChinese() {
        Chinese chinese = new Chinese();
        chinese.setId(1L);
        chinese.setName("roc");
        chinese.setColor("yellow");
        System.out.println(chinese);
        return chinese;
    }
}
