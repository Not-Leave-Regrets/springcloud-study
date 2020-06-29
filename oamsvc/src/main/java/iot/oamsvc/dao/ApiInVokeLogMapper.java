package iot.oamsvc.dao;

import iot.oamsvc.entity.ApiInVokeLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ApiInVokeLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_api_invoke_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer apiLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_api_invoke_log
     *
     * @mbg.generated
     */
    int insert(ApiInVokeLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_api_invoke_log
     *
     * @mbg.generated
     */
    ApiInVokeLog selectByPrimaryKey(Integer apiLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_api_invoke_log
     *
     * @mbg.generated
     */
    List<ApiInVokeLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_api_invoke_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ApiInVokeLog record);
}