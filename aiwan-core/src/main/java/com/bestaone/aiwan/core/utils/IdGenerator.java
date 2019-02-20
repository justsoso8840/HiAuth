package com.bestaone.aiwan.core.utils;

import java.io.Serializable;

/**
 * 主键生成器
 * @author zhangguosheng
 */
public interface IdGenerator<ID extends Serializable> {

    /**
     * 获取一个主键
     * @return
     */
    ID generate();

}