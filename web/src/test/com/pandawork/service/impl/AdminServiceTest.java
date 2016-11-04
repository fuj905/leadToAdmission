package com.pandawork.service.impl;

import com.pandawork.common.entity.Notice;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.service.AdminService;
import com.pandawork.test.AbstractTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;


/**
 * 管理员处理测试页
 * Created by fujia on 2016/10/25.
 */
public class AdminServiceTest extends AbstractTestCase {

    @Autowired
    AdminService adminService;

    //测试增加一条公告
    @Test
    public void newNotice() throws SSException{
        Notice notice = new Notice();
        notice.setTitle("测试题目");
        notice.setAuthor("fujia");
        notice.setContent("这里是内容");
        notice.setOrganization(2);
        notice.setType(1);
        adminService.newNotice(notice);
        System.out.println("添加成功");
    }

    //测试根据id删除一条公告
    @Test
    public void delNoticeById() throws SSException{
        adminService.delNoticeById(4);
    }

    //根据id修改一条公告
    @Test
    public void updateNoticeById() throws SSException{
        Notice notice = new Notice();
        notice.setId(5);
        notice.setAuthor("zuozhe");
        notice.setContent("目录");
        notice.getId();
        notice.setOrganization(1);
        notice.setTitle("ksdkse");
        notice.setType(1);
        notice.setContent("修改过后的内容");
        adminService.updateNoticeById(notice);
    }

    //测试根据所属机构和类型查询公告列表
    @Test
    public void listNoticeByOrganizationAndType() throws SSException{
        List<Notice> info = Collections.emptyList();
        info = adminService.listNoticeByOrganizationAndType(1,1);
        System.out.println("题目是：" + info);
    }

    //测试根据id查询公告详情
    @Test
    public void queryNoticeById() throws SSException{
      //  System.out.println(adminService.queryNoticeById(5));
        Notice notice = new Notice();
        notice = adminService.queryNoticeById(5);
        System.out.println(notice.getAuthor());
    }
}
