package com.pandawork.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 学校表
 * Created by fujia on 2016/11/9.
 */
@Table(name = "t_school")
@Entity
public class School {


    //学校表id
    @Id
    private Integer id;

    //学校名称
    private String name;

    //学校简介
    private String introduction;

    //学校标识
    private String logo;

    //学校定位
    private String positioning;

    //机构设置
    private String institutions;

    //校友群芳
    private String alumni;

    //校情统计
    @Column(name = "college_situation")
    private String collegeSituation;

    //校园美景
    @Column(name = "beautiful_scenery")
    private String beautifulScenery;

    //招生就业
    private String admissions;

    //历史名人
    @Column(name = "historical_figures")
    private String historicalFigures;

    //学科建设
    @Column(name = "discipline_construction")
    private String disciplineConstruction;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPositioning() {
        return positioning;
    }

    public void setPositioning(String positioning) {
        this.positioning = positioning;
    }

    public String getInstitutions() {
        return institutions;
    }

    public void setInstitutions(String institutions) {
        this.institutions = institutions;
    }

    public String getAlumni() {
        return alumni;
    }

    public void setAlumni(String alumni) {
        this.alumni = alumni;
    }

    public String getCollegeSituation() {
        return collegeSituation;
    }

    public void setCollegeSituation(String collegeSituation) {
        this.collegeSituation = collegeSituation;
    }

    public String getBeautifulScenery() {
        return beautifulScenery;
    }

    public void setBeautifulScenery(String beautifulScenery) {
        this.beautifulScenery = beautifulScenery;
    }

    public String getAdmissions() {
        return admissions;
    }

    public void setAdmissions(String admission) {
        this.admissions = admission;
    }

    public String getHistoricalFigures() {
        return historicalFigures;
    }

    public void setHistoricalFigures(String historicalFigures) {
        this.historicalFigures = historicalFigures;
    }

    public String getDisciplineConstruction() {
        return disciplineConstruction;
    }

    public void setDisciplineConstruction(String disciplineConstruction) {
        this.disciplineConstruction = disciplineConstruction;
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
