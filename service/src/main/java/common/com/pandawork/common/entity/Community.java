package com.pandawork.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 社团表
 * Created by fujia on 2016/10/24.
 */
@Table(name = "t_community")
@Entity
public class Community {

    //社团表id
    @Id
    private Integer id;

    //组织id（0-学校性，其他为对应学院表中学院性质的）
    @Column(name = "organization_id")
    private Integer organizationId;

    //社团名称
    @Column(name ="community_name")
    private String communityName;

    //社团描述
    @Column(name ="community_description")
    private String communityDescription;

    //创建时间
    @Column(name = "creat_time")
    private Date creatTime;

    //最后修改时间
    @Column(name ="last_modified_time")
    private Date lastModifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityDescription() {
        return communityDescription;
    }

    public void setCommunityDescription(String communityDescription) {
        this.communityDescription = communityDescription;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }
}
