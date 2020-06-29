package iot.oamsvc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import iot.oamsvc.dao.StaffOperationLogMapper;
import iot.oamsvc.entity.StaffOperationLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  StaffOperationLogService implements LoggerImpl<StaffOperationLog>  {
    @Autowired
    private StaffOperationLogMapper staffOperationLogMapper;
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public StaffOperationLog getLogById(Integer logId) {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(logId==null){
            logger.debug(methodName+"执行，参数异常");
            return null;
        }
        logger.info(methodName+"开始执行");
        StaffOperationLog staffOperationLog = staffOperationLogMapper.selectByPrimaryKey(logId);
        logger.info(methodName+"执行结束");
        return staffOperationLog;
    }

    @Override
    public PageInfo<StaffOperationLog> getLogByLike(Integer pageNum,Integer pageSize,StaffOperationLog staffOperationLog) {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(staffOperationLog == null){
            logger.debug(methodName+"执行，参数异常");
            return null;
        }
        logger.info(methodName+"开始执行");
        PageHelper.startPage(pageNum!=null?1:pageNum,pageSize!=null?10:pageSize);
        List<StaffOperationLog> list = staffOperationLogMapper.selectByLike(staffOperationLog);
        PageInfo<StaffOperationLog> pageInfo = new PageInfo<>(list);

        logger.info(methodName+"执行结束");
        return pageInfo ;
    }

    @Override
    public PageInfo<StaffOperationLog> getLogByExact(Integer pageNum,Integer pageSize,StaffOperationLog staffOperationLog) {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(staffOperationLog == null){
            logger.debug(methodName+"执行，参数异常");
            return null;
        }
        logger.info(methodName+"开始执行");
        PageHelper.startPage(pageNum == null? 1:pageNum,pageSize==null?10:pageSize);
        List<StaffOperationLog> list = staffOperationLogMapper.selectByExact(staffOperationLog);
        PageInfo<StaffOperationLog> pageInfo = new PageInfo<>(list);
        logger.info(methodName+"执行结束");
        return pageInfo ;
    }

    @Override
    public int postLog(StaffOperationLog staffOperationLog) {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(staffOperationLog == null){
            logger.debug(methodName+"执行，参数异常");
            return 0;
        }
        logger.info(methodName+"开始执行");
        int count  = staffOperationLogMapper.insert(staffOperationLog);
        logger.info(methodName+"执行结束");
        return count ;
    }

    @Override
    public int putLogById(StaffOperationLog staffOperationLog) {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(staffOperationLog == null){
            logger.debug(methodName+"执行，参数异常");
            return 0;
        }
        logger.info(methodName+"开始执行");
        int count  = staffOperationLogMapper.updateByPrimaryKey(staffOperationLog);
        logger.info(methodName+"执行结束");
        return count ;
    }

    @Override
    public int putLogByExact(StaffOperationLog staffOperationLog) {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(staffOperationLog == null){
            logger.debug(methodName+"执行，参数异常");
            return 0;
        }
        logger.info(methodName+"开始执行");
        int count  = staffOperationLogMapper.updateByPrimaryKey(staffOperationLog);
        logger.info(methodName+"执行结束");
        return count ;
    }

    @Override
    public int deleteLogById(Integer logId) {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(logId == null){
            logger.debug(methodName+"执行，参数异常");
            return 0;
        }
        logger.info(methodName+"开始执行");
        int count  = staffOperationLogMapper.deleteByPrimaryKey(logId);
        logger.info(methodName+"执行结束");
        return count ;
    }

    @Override
    public int deleteLogByExact(StaffOperationLog staffOperationLog) {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(staffOperationLog == null){
            logger.debug(methodName+"执行，参数异常");
            return 0;
        }
        logger.info(methodName+"开始执行");
        int count  = staffOperationLogMapper.deleteByExact(staffOperationLog);
        logger.info(methodName+"执行结束");
        return count ;
    }
}
