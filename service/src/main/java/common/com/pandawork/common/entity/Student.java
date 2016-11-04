package com.pandawork.common.entity;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Auther:lusi
 * Time：2016/10/24
 * Description:
 */

@Table(name = "t_stu_info")
@Entity
public class Student extends AbstractEntity {

    //学生表唯一标识
    @Id
    private Integer id;

    //学生姓名
    @Column(name = "name")
    private String name;

    //专业代码
    @Column(name = "major_id")
    private Integer majoId;

    //省份代码
    @Column(name = "place_id")
    private Integer placeId;

    //性别
    @Column(name = "sex")
    private Integer sex;

    //用户id
    @Column(name = "user_id")
    private Integer userId;

    //创建时间
    @Column(name = "created_time")
    private Date createTime;

    //最后修改时间
    @Column(name = "last_modified_time")
    private Date lastModifiedTime;

    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMajoId() {
        return majoId;
    }

    public void setMajoId(Integer majoId) {
        this.majoId = majoId;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

