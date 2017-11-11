package com.ambition.model;

import lombok.Data;

/**
 * Created by caoti on 2017/11/10.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 这个世界每天都有太多遗憾,所以你好,再见!
 */
@Data
public class Cat extends Animal {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String color;
}
