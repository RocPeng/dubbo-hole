package com.ambition.service.core;

import com.ambition.model.Cat;
import com.ambition.service.api.AnimalService;
import org.springframework.stereotype.Service;

/**
 * Created by caoti on 2017/11/10.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 这个世界每天都有太多遗憾,所以你好,再见!
 */
@Service
public class AnimalServiceImpl implements AnimalService {
    @Override
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setId(1L);
        cat.setName("mimi");
        cat.setColor("white");
        System.out.println(cat);
        return cat;
    }
}
