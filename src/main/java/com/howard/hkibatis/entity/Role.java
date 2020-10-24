package com.howard.hkibatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author ChenJiWei
 * @version V1.0
 * @date 2020/10/20
 * @description
 */
@TableName(value = "role")
public class Role {

    @TableId(type = IdType.ID_WORKER_STR)
    private String id;
    private String roleName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
