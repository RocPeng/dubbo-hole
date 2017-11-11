package com.ambition.web;

import com.ambition.model.Cat;
import com.ambition.model.Chinese;
import com.ambition.service.api.AnimalService;
import com.ambition.service.api.CollectorService;
import com.ambition.service.api.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by caoti on 2017/11/10.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 这个世界每天都有太多遗憾,所以你好,再见!
 */
@RestController
@RequestMapping("/dubbo")
public class DubboController {
    @Autowired
    private AnimalService animalService;

    @Autowired
    private PersonService personService;

    @Autowired
    private CollectorService collectorService;

    @RequestMapping("/cat")
    public Cat getCat(){
        return animalService.getCat();
    }

    @RequestMapping("/chinese")
    public Chinese getChinese(){
        return personService.getChinese();
    }

    @RequestMapping("/hashmap")
    public Map getHashmap(){
        return collectorService.getHashMap();
    }

    @RequestMapping("/immutableMap")
    public Map getImmutableMap(){
        return collectorService.getImmutableMap();
    }

    /**
     * 超时调用
     * @return
     * @throws Exception
     */
    @RequestMapping("/hashmapTimeout")
    public Map getHashMapTimeout() throws Exception {
        return collectorService.getHashMapTimeout();
    }

}
