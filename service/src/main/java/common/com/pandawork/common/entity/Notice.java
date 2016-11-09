package com.pandawork.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 公告表
 * Created by fujia on 2016/10/25.
 */
@Table(name = "t_notice")
@Entity
public class Notice {

    //公告表id
    @Id
    private Integer id;

    //公告题目
    @Column(name = "title")
    private String title;

    //公告作者
    @Column(name = "author")
    private String author;

    //公告目录
    @Column(name = "content")
    private String content;

    //公告分类（1—通知，2—新鲜事儿，3—活动专题）
    @Column(name = "type")
    private Integer type;

    //公告隶属机构（0—学校，其他对应专业表）
    @Column(name = "organization")
    private Integer organization;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOrganization() {
        return organization;
    }

    public void setOrganization(Integer organization) {
        this.organization = organization;
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
