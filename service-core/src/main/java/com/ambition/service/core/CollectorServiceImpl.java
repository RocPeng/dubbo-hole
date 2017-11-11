package com.ambition.service.core;

import com.ambition.service.api.CollectorService;
import com.google.common.collect.ImmutableMap;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by caoti on 2017/11/10.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 这个世界每天都有太多遗憾,所以你好,再见!
 */
@Service
public class CollectorServiceImpl implements CollectorService {
    @Override
    public Map getHashMap() {
        Map<String,String> map = new HashMap<>();
        map.put("name","roc");
        map.put("sex","boy");
        System.out.println("getHashMap()"+map);
        return map;
    }

    @Override
    public Map getImmutableMap() {
        ImmutableMap<String, String> map = ImmutableMap.of("name", "roc", "sex", "boy");
        System.out.println("getImmutableMap()"+map);
        return map;
    }

    @Override
    public Map getHashMapTimeout() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("name","roc");
        map.put("sex","boy");
        Thread.sleep(40000);
        return map;
    }


}
