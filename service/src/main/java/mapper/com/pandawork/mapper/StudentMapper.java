package com.pandawork.mapper;

import com.pandawork.common.entity.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 学生信息管理mapper层
 * Created by fujia on 2016/3/28.
 */
public interface StudentMapper {

    /**
     * 查询公告列表
     * @param organization
     * @param type
     * @return
     * @throws Exception
     */
    public List<Notice> listNoticeByOrganizationAndType(@Param("organization") int organization, @Param("type") int type) throws Exception;

    /**
     * 根据公告id查询公告详情
     * @param id
     * @return
     * @throws Exception
     */
    public Notice queryNoticeById(@Param("id") int id) throws Exception;

    /**
     * 查询学校简介
     * @param id
     * @return
     * @throws Exception
     */
    public void querySchoolIntroduction(@Param("id") int id) throws Exception;


}
