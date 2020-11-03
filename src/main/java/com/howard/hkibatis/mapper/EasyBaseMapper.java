package com.howard.hkibatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Collection;

/**
 * @author ChenJiWei
 * @version V1.0
 * @date 2020/10/24
 * @description 扩展mybatis-plus自带的mapper
 */
public interface EasyBaseMapper<T> extends BaseMapper<T> {

    /**
     * 批量插入  仅仅使用与mysql
     *
     * @param collection 实体列表
     * @return
     */
    Integer insertBatchSomeColumn(Collection<T> collection);
}
