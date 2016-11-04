package com.pandawork.mapper;

import com.pandawork.common.entity.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 管理员处理mapper层
 * Created by fujia on 2016/10/25.
 */
public interface AdminMapper {

    /**
     * 增加一条新的公告
     * @param notice
     * @throws Exception
     */
    public void newNotice(@Param("notice") Notice notice) throws Exception;

    /**
     * 根据公告id删除公告
     * @param id
     * @throws Exception
     */
    public void delNoticeById(@Param("id") int id) throws Exception;

    /**
     * 根据公告id修改一条公告
     * @param notice
     * @throws Exception
     */
    public void updateNoticeById(@Param("notice") Notice notice) throws Exception;

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


}
