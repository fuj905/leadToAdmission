package com.pandawork.service.impl;

import com.pandawork.common.entity.Notice;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.service.StudentService;
import com.pandawork.test.AbstractTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;

/**
 * Created by fujia on 2016/11/12.
 */
public class StudentServiceTest extends AbstractTestCase {

    @Autowired
    StudentService studentService;

    //测试根据所属机构和类型查询公告列表
    @Test
    public void listNoticeByOrganizationAndType() throws SSException {
        List<Notice> info = Collections.emptyList();
        info = studentService.listNoticeByOrganizationAndType(1,1);
        System.out.println("题目是：" + info);
    }

    //测试根据id查询公告详情
    @Test
    public void queryNoticeById() throws SSException{
        //  System.out.println(adminService.queryNoticeById(5));
        Notice notice = new Notice();
        notice = studentService.queryNoticeById(5);
        System.out.println(notice.getAuthor());
    }

    //测试根据id查询学校简介
    @Test
    public void querySchoolIntroduction() throws SSException{
        studentService.querySchoolIntroduction(1);
    }
}
