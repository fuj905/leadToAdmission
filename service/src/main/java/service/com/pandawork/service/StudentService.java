package com.pandawork.service;

import com.pandawork.common.entity.Notice;
import com.pandawork.common.entity.School;
import com.pandawork.core.common.exception.SSException;

import java.util.List;

/**
 * 学生管理系统
 * studentService层
 * Created by fujia on 2016/3/28.
 */
public interface StudentService {

    /**
     * 根据所属机构和类型查询公告列表
     * @param organization
     * @param type
     * @return
     * @throws SSException
     */
    public List<Notice> listNoticeByOrganizationAndType(int organization, int type) throws SSException;

    /**
     * 根据id查询公告详情
     * @param id
     * @return
     * @throws SSException
     */
    public Notice queryNoticeById(int id) throws SSException;

    /**
     * 查询学校简介
     * @param id
     * @throws SSException
     */
    public String querySchoolIntroduction(int id) throws SSException;

    /**
     * 查询学校标识
     * @param id
     * @return
     * @throws SSException
     */
    public String querySchoolLogo(int id) throws SSException;

    /**
     * 查询学校定位
     * @param id
     * @return
     * @throws SSException
     */
    public String querySchoolPositioning(int id) throws SSException;

    /**
     * 查询学校机构设置
     * @param id
     * @return
     * @throws SSException
     */
    public String querySchoolInstitutions(int id) throws SSException;

    /**
     * 查询学校详情
     * @param id
     * @return
     * @throws SSException
     */
    public School querySchoolDetail(int id) throws SSException;
}
