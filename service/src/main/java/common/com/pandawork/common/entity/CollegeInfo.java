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

    @Id
    private Integer id;

    @Column(name = "college_id")
    private Integer collegeId;

    @Column(name = "major_set")
    private String majorSet;

    @Column(name = "lesson")
    private String lesson;

    @Column(name = "community_id")
    private Integer communityId;

    @Column(name = "award")
    private String award;

    @Column(name = "employment")
    private String employment;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "pupil")
    private String pupil;

    @Column(name = "notice")
    private Integer notice;

    @Column(name = "creat_time")
    private Date creatTime;

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
