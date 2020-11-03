package com.howard.hkibatis.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.howard.hkibatis.entity.Role;
import com.howard.hkibatis.entity.User;
import com.howard.hkibatis.mapper.RoleMapper;
import com.howard.hkibatis.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenJiWei
 * @version V1.0
 * @date 2020/10/20
 * @description 分页查询使用步骤：
 *
 * 1.配置分页拦截器 com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
 * 2.构造分页查询参数对象 com.baomidou.mybatisplus.core.metadata.IPage
 * 3.使用mapper.selectPage方法即可
 */
@RestController
@RequestMapping(value = "role")
public class RoleController {

    private static final Logger logger = LoggerFactory.getLogger(RoleController.class);
    @Resource
    RoleService roleService;

    @RequestMapping(value = "page")
    public Object page(Page<Role> page) {
        return roleService.selectPage(page);
    }

    @RequestMapping(value = "saveBatch")
    public Object saveBatch(String roleName) {
        return roleService.saveBatch(roleName);
    }


    @RequestMapping(value = "saveBatchColumn")
    public Object saveBatchColumn(String roleName) {
        roleService.saveBatchColumn(roleName);
        return new Object();
    }
}
