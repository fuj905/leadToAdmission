package com.pandawork.service.impl;

import com.pandawork.common.entity.Notice;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.core.framework.dao.CommonDao;
import com.pandawork.mapper.StudentMapper;
import com.pandawork.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 学生管理系统
 * studentService的实现
 * Created by fujia on 2016/3/28.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    protected CommonDao commonDao;

    @Override
    public List<Notice> listNoticeByOrganizationAndType(int organization, int type) throws SSException {
        try{
            if(Assert.lessOrEqualZero(organization) || Assert.lessOrEqualZero(type)){
                return null;
            }
            else {
                return studentMapper.listNoticeByOrganizationAndType(organization, type);
            }
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException,e);
        }
    }

    @Override
    public Notice queryNoticeById(int id) throws SSException {
        if(Assert.lessOrEqualZero(id)){
            return null;
        }
        try{
            return studentMapper.queryNoticeById(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException,e);
        }
    }

    @Override
    public void querySchoolIntroduction(int id) throws SSException {
        if(Assert.lessOrEqualZero(id)){
            return;
        }
        try{
            studentMapper.querySchoolIntroduction(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException,e);
        }
    }
}
