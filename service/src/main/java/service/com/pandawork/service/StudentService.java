package com.pandawork.service;

import com.pandawork.common.entity.Notice;
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
    public void querySchoolIntroduction(int id) throws SSException;
}
