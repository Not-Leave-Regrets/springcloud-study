package iot.oamsvc.dao;

import iot.oamsvc.entity.OperationObject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OperationObjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operate_object
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer objectType);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operate_object
     *
     * @mbg.generated
     */
    int insert(OperationObject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operate_object
     *
     * @mbg.generated
     */
    OperationObject selectByPrimaryKey(Integer objectType);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operate_object
     *
     * @mbg.generated
     */
    List<OperationObject> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operate_object
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OperationObject record);
}