package com.pandawork.service.impl;

import com.pandawork.common.entity.Notice;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.mapper.AdminMapper;
import com.pandawork.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fujia on 2016/10/25.
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public void newNotice(Notice notice) throws SSException {
        if(Assert.isNull(notice.getAuthor())){
            return ;
        }
        try{
            adminMapper.newNotice(notice);
        }catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.ListStudentAll, e);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public void delNoticeById(int id) throws SSException {
        if(Assert.lessOrEqualZero(id)){
            return;
        }
        try{
            adminMapper.delNoticeById(id);
        }catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public void updateNoticeById(Notice notice) throws SSException {
        if(Assert.isNull(notice)){
            return;
        }
        try{
            adminMapper.updateNoticeById(notice);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException,e);
        }

    }


}
