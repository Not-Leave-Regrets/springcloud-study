package iot.oamsvc.entity;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.Date;

public class ApiInVokeLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_api_invoke_log.api_log_id
     *
     * @mbg.generated
     */
    private Integer apiLogId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_api_invoke_log.siteid
     *
     * @mbg.generated
     */
    private Long siteid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_api_invoke_log.sid
     *
     * @mbg.generated
     */
    private Integer sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_api_invoke_log.service_name
     *
     * @mbg.generated
     */
    private String serviceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_api_invoke_log.path
     *
     * @mbg.generated
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_api_invoke_log.success_flag
     *
     * @mbg.generated
     */
    private Short successFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_api_invoke_log.ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_api_invoke_log.invoke_time
     *
     * @mbg.generated
     */
    private Date invokeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_api_invoke_log.staff_id
     *
     * @mbg.generated
     */
    private Long staffId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_api_invoke_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_api_invoke_log.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_api_invoke_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_api_invoke_log.api_log_id
     *
     * @return the value of t_api_invoke_log.api_log_id
     *
     * @mbg.generated
     */
    public Integer getApiLogId() {
        return apiLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_api_invoke_log.api_log_id
     *
     * @param apiLogId the value for t_api_invoke_log.api_log_id
     *
     * @mbg.generated
     */
    public void setApiLogId(Integer apiLogId) {
        this.apiLogId = apiLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_api_invoke_log.siteid
     *
     * @return the value of t_api_invoke_log.siteid
     *
     * @mbg.generated
     */
    public Long getSiteid() {
        return siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_api_invoke_log.siteid
     *
     * @param siteid the value for t_api_invoke_log.siteid
     *
     * @mbg.generated
     */
    public void setSiteid(Long siteid) {
        this.siteid = siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_api_invoke_log.sid
     *
     * @return the value of t_api_invoke_log.sid
     *
     * @mbg.generated
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_api_invoke_log.sid
     *
     * @param sid the value for t_api_invoke_log.sid
     *
     * @mbg.generated
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_api_invoke_log.service_name
     *
     * @return the value of t_api_invoke_log.service_name
     *
     * @mbg.generated
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_api_invoke_log.service_name
     *
     * @param serviceName the value for t_api_invoke_log.service_name
     *
     * @mbg.generated
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_api_invoke_log.path
     *
     * @return the value of t_api_invoke_log.path
     *
     * @mbg.generated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_api_invoke_log.path
     *
     * @param path the value for t_api_invoke_log.path
     *
     * @mbg.generated
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_api_invoke_log.success_flag
     *
     * @return the value of t_api_invoke_log.success_flag
     *
     * @mbg.generated
     */
    public Short getSuccessFlag() {
        return successFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_api_invoke_log.success_flag
     *
     * @param successFlag the value for t_api_invoke_log.success_flag
     *
     * @mbg.generated
     */
    public void setSuccessFlag(Short successFlag) {
        this.successFlag = successFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_api_invoke_log.ip
     *
     * @return the value of t_api_invoke_log.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_api_invoke_log.ip
     *
     * @param ip the value for t_api_invoke_log.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_api_invoke_log.invoke_time
     *
     * @return the value of t_api_invoke_log.invoke_time
     *
     * @mbg.generated
     */
    public Date getInvokeTime() {
        return invokeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_api_invoke_log.invoke_time
     *
     * @param invokeTime the value for t_api_invoke_log.invoke_time
     *
     * @mbg.generated
     */
    public void setInvokeTime(Date invokeTime) {
        this.invokeTime = invokeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_api_invoke_log.staff_id
     *
     * @return the value of t_api_invoke_log.staff_id
     *
     * @mbg.generated
     */
    public Long getStaffId() {
        return staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_api_invoke_log.staff_id
     *
     * @param staffId the value for t_api_invoke_log.staff_id
     *
     * @mbg.generated
     */
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_api_invoke_log.create_time
     *
     * @return the value of t_api_invoke_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_api_invoke_log.create_time
     *
     * @param createTime the value for t_api_invoke_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_api_invoke_log.remark
     *
     * @return the value of t_api_invoke_log.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_api_invoke_log.remark
     *
     * @param remark the value for t_api_invoke_log.remark
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