package com.pandawork.mapper;

import com.pandawork.common.entity.Notice;
import com.pandawork.common.entity.School;
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
    public String querySchoolIntroduction(@Param("id") int id) throws Exception;

    /**
     * 查询学校标识
     * @param id
     * @return
     * @throws Exception
     */
    public String querySchoolLogo(@Param("id") int id) throws Exception;

    /**
     * 查询学校定位
     * @param id
     * @return
     * @throws Exception
     */
    public String querySchoolPositioning(@Param("id") int id) throws Exception;

    /**
     * 查询机构设置
     * @param id
     * @return
     * @throws Exception
     */
    public String querySchoolInstitutions(@Param("id") int id) throws Exception;

    /**
     * 测试查询学校详情
     * @param id
     * @return
     * @throws Exception
     */
    public School querySchoolDetail(@Param("id") int id) throws Exception;
}
