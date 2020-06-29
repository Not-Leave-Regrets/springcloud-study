package iot.oamsvc.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import iot.oamsvc.common.R;
import iot.oamsvc.common.ResultCode;
import iot.oamsvc.entity.StaffOperationLog;
import iot.oamsvc.service.impl.StaffOperationLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api("用户操作日志")
@RequestMapping("/solApi")
public class StaffOpertionLogController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private StaffOperationLogService staffOperationLogService;
    @ApiOperation("根据logId获取日志信息")
    @GetMapping("/getLogById")
    public R<StaffOperationLog> getLogById(Integer logId){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(logId==null){
            logger.debug(methodName+"执行，参数异常");
            return R.fail(ResultCode.PARAM_MISS);
        }
        logger.info(methodName+"开始执行");
        StaffOperationLog log = staffOperationLogService.getLogById(logId);
        logger.info(methodName+"执行结束");
        return R.data(log);
    }
    @ApiOperation("模糊查找日志信息")
    @GetMapping("/getLogByLike")
    public R<PageInfo> getLogByLike(Integer pageNum,Integer pageSize,StaffOperationLog staffOperationLog){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(staffOperationLog==null){
            logger.debug(methodName+"执行，参数异常");
            return R.fail(ResultCode.PARAM_MISS);
        }
        logger.info(methodName+"开始执行");
        PageInfo<StaffOperationLog> pageInfo = staffOperationLogService.getLogByLike(pageNum, pageSize, staffOperationLog);
        logger.info(methodName+"执行结束");
        return R.data(pageInfo);
    }
    @ApiOperation("精确查找日志信息")
    @GetMapping("/getLogByExact")
    public R<PageInfo> getLogByExact(Integer pageNum,Integer pageSize,StaffOperationLog staffOperationLog){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(staffOperationLog==null){
            logger.debug(methodName+"执行，参数异常");
            return R.fail(ResultCode.PARAM_MISS);
        }
        logger.info(methodName+"开始执行");
        PageInfo<StaffOperationLog> pageInfo = staffOperationLogService.getLogByExact(pageNum, pageSize, staffOperationLog);
        logger.info(methodName+"执行结束");
        return R.data(pageInfo);
    }
    @ApiOperation("新增日志信息")
    @PostMapping("/postLog")
    public R<Integer> postLog(StaffOperationLog staffOperationLog){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(staffOperationLog==null){
            logger.debug(methodName+"执行，参数异常");
            return R.fail(ResultCode.PARAM_MISS);
        }
        logger.info(methodName+"执行开始");
        int count  = staffOperationLogService.postLog(staffOperationLog);
        logger.info(methodName+"执行结束");
        return R.data(count);
    }
    @ApiOperation("根据Id修改日志信息")
    @PutMapping("/putLogById")
    public R<Integer> putLogById(Integer logId){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(logId == null){
            logger.debug(methodName+"执行，参数异常");
            return R.fail(ResultCode.PARAM_MISS);
        }
        logger.info(methodName+"执行开始");
        int count  = staffOperationLogService.deleteLogById(logId);
        logger.info(methodName+"执行结束");
        return R.data(count);
    }
    @ApiOperation("按条件精确修改日志信息")
    @PutMapping("/putLogByExact")
    public R<Integer> PutLogByExact(StaffOperationLog staffOperationLog){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(staffOperationLog==null){
            logger.debug(methodName+"执行，参数异常");
            return R.fail(ResultCode.PARAM_MISS);
        }
        logger.info(methodName+"执行开始");
        int count  = staffOperationLogService.putLogByExact(staffOperationLog);
        logger.info(methodName+"执行结束");
        return R.data(count);
    }
    @ApiOperation("按条件精确删除日志信息")
    @DeleteMapping("/deleteLogByExact")
    public R<Integer> deleteLogByExact(StaffOperationLog staffOperationLog){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(staffOperationLog==null){
            logger.debug(methodName+"执行，参数异常");
            return R.fail(ResultCode.PARAM_MISS);
        }
        logger.info(methodName+"执行开始");
        int count  = staffOperationLogService.deleteLogByExact(staffOperationLog);
        logger.info(methodName+"执行结束");
        return R.data(count);
    }
    @ApiOperation("根据Id删除日志信息")
    @DeleteMapping("/deleteLogById")
    public R<Integer> deleteLogById(StaffOperationLog staffOperationLog){
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if(staffOperationLog==null){
            logger.debug(methodName+"执行，参数异常");
            return R.fail(ResultCode.PARAM_MISS);
        }
        logger.info(methodName+"执行开始");
        int count  = staffOperationLogService.putLogByExact(staffOperationLog);
        logger.info(methodName+"执行结束");
        return R.data(count);
    }
}
