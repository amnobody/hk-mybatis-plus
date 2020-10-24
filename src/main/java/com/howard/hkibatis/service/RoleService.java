package com.howard.hkibatis.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.howard.hkibatis.entity.Role;
import com.howard.hkibatis.mapper.RoleMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author ChenJiWei
 * @version V1.0
 * @date 2020/10/20
 * @description
 */
@Service
public class RoleService extends ServiceImpl<RoleMapper, Role> {

    public boolean saveBatch(String roleName) {
        List<Role> roleList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Role role = new Role();
            role.setRoleName(roleName + i);
            roleList.add(role);
        }
        return super.saveBatch(roleList);
    }

    public IPage<Role> selectPage(Page<Role> page) {
        QueryWrapper<Role> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("role_name", "guest8").select("role_name");
        IPage<Role> pageInfo = this.baseMapper.selectPage(page, queryWrapper);
        return pageInfo;
    }

    @Override
    public boolean saveBatch(Collection<Role> entityList) {

        return false;
    }
}
