package com.howard.hkibatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.howard.hkibatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ChenJiWei
 * @version V1.0
 * @date 2020/10/20
 * @description
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
