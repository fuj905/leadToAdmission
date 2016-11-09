package com.pandawork.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 专业详情表
 * User: fujia
 * Date: 2016/10/21
 * Time: 9:38
 */
@Table(name = "t_college_info")
@Entity
public class CollegeInfo {

    //专业详情表id
    @Id
    private Integer id;

    //学院id
    @Column(name = "college_id")
    private Integer collegeId;

    //专业设置
    @Column(name = "major_set")
    private String majorSet;

    //课程设置
    @Column(name = "lesson")
    private String lesson;

    //社团设置
    @Column(name = "community_id")
    private Integer communityId;

    //评奖评优情况
    @Column(name = "award")
    private String award;

    //就业情况
    @Column(name = "employment")
    private String employment;

    //师资力量
    @Column(name = "faculty")
    private String faculty;

    //生源
    @Column(name = "pupil")
    private String pupil;

    //公告id
    @Column(name = "notice")
    private Integer notice;

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

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getMajorSet() {
        return majorSet;
    }

    public void setMajorSet(String majorSet) {
        this.majorSet = majorSet;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getPupil() {
        return pupil;
    }

    public void setPupil(String pupil) {
        this.pupil = pupil;
    }

    public Integer getNotice() {
        return notice;
    }

    public void setNotice(Integer notice) {
        this.notice = notice;
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
