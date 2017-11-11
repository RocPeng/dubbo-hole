package com.ambition.service.api;

import java.util.Map;

/**
 * Created by caoti on 2017/11/10.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 这个世界每天都有太多遗憾,所以你好,再见!
 */

public interface CollectorService {
    Map getHashMap();
    Map getImmutableMap();
    Map getHashMapTimeout() throws Exception;
}
