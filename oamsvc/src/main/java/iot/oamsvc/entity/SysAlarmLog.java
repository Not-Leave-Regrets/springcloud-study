package iot.oamsvc.entity;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.Date;

public class SysAlarmLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_alarm_log.alarm_id
     *
     * @mbg.generated
     */
    private Integer alarmId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_alarm_log.appid
     *
     * @mbg.generated
     */
    private Integer appid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_alarm_log.modid
     *
     * @mbg.generated
     */
    private Long modid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_alarm_log.level
     *
     * @mbg.generated
     */
    private Integer level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_alarm_log.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_alarm_log.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_alarm_log.alarm_time
     *
     * @mbg.generated
     */
    private Date alarmTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_alarm_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_alarm_log.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_alarm_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_alarm_log.alarm_id
     *
     * @return the value of t_alarm_log.alarm_id
     *
     * @mbg.generated
     */
    public Integer getAlarmId() {
        return alarmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_alarm_log.alarm_id
     *
     * @param alarmId the value for t_alarm_log.alarm_id
     *
     * @mbg.generated
     */
    public void setAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_alarm_log.appid
     *
     * @return the value of t_alarm_log.appid
     *
     * @mbg.generated
     */
    public Integer getAppid() {
        return appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_alarm_log.appid
     *
     * @param appid the value for t_alarm_log.appid
     *
     * @mbg.generated
     */
    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_alarm_log.modid
     *
     * @return the value of t_alarm_log.modid
     *
     * @mbg.generated
     */
    public Long getModid() {
        return modid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_alarm_log.modid
     *
     * @param modid the value for t_alarm_log.modid
     *
     * @mbg.generated
     */
    public void setModid(Long modid) {
        this.modid = modid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_alarm_log.level
     *
     * @return the value of t_alarm_log.level
     *
     * @mbg.generated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_alarm_log.level
     *
     * @param level the value for t_alarm_log.level
     *
     * @mbg.generated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_alarm_log.code
     *
     * @return the value of t_alarm_log.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_alarm_log.code
     *
     * @param code the value for t_alarm_log.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_alarm_log.content
     *
     * @return the value of t_alarm_log.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_alarm_log.content
     *
     * @param content the value for t_alarm_log.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_alarm_log.alarm_time
     *
     * @return the value of t_alarm_log.alarm_time
     *
     * @mbg.generated
     */
    public Date getAlarmTime() {
        return alarmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_alarm_log.alarm_time
     *
     * @param alarmTime the value for t_alarm_log.alarm_time
     *
     * @mbg.generated
     */
    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_alarm_log.create_time
     *
     * @return the value of t_alarm_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_alarm_log.create_time
     *
     * @param createTime the value for t_alarm_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_alarm_log.remark
     *
     * @return the value of t_alarm_log.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_alarm_log.remark
     *
     * @param remark the value for t_alarm_log.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    @Override
    public String toString() {
        String jsonStr = JSONObject.toJSONString(this);
        return jsonStr ;
    }
}