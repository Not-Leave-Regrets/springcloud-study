package iot.oamsvc.service.impl;

import com.github.pagehelper.PageInfo;

public interface LoggerImpl<T> {
    T getLogById(Integer logId);
    PageInfo<T> getLogByLike(Integer pageNum,Integer pageSize,T t);
    PageInfo<T> getLogByExact(Integer pageNum,Integer pageSize,T t);

    int postLog(T t);

    int putLogById(T t);
    int putLogByExact(T t);

    int deleteLogById(Integer logId);
    int deleteLogByExact(T t);
}
