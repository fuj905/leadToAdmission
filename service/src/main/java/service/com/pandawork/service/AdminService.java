package com.pandawork.service;

import com.pandawork.common.entity.Notice;
import com.pandawork.core.common.exception.SSException;

import java.util.List;

/**
 * 管理员处理service
 * Created by fujia on 2016/10/25.
 */
public interface AdminService {

    /**
     * 新增一条公告
     * @param notice
     * @throws SSException
     */
    public void newNotice(Notice notice) throws SSException;

    /**
     * 根据id删除一条公告
     * @param id
     * @throws SSException
     */
    public void delNoticeById(int id) throws SSException;

    /**
     * 根据id修改一条公告
     * @param notice
     * @throws SSException
     */
    public void updateNoticeById(Notice notice) throws SSException;

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
}
