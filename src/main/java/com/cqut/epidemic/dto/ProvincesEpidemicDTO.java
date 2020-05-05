package com.cqut.epidemic.dto;

import java.util.Date;

/**
 * @author 罗舒月
 * @Describe 省市疫情数据
 * @date 2020/5/1 6:34 下午
 */
public class ProvincesEpidemicDTO {

    /** ID */
    private Long id;

    /** 省份名称 */
    private String provinceName;

    /** 地区名称 */
    private String areaName;

    /** 确诊人数 */
    private Integer confirmedNumber;

    /** 疑似人数 */
    private Integer suspectedNumber;

    /** 重症人数 */
    private Integer severeNumber;

    /** 治愈人数 */
    private Integer cureNumber;

    /** 死亡人数 */
    private Integer deathNumber;

    /** 境外输入病例 */
    private Integer overseasImportNumber;

    /** 今日新增死亡人数 */
    private Integer newDeathNumber;

    /** 今日新增确诊人数 */
    private Integer newConfirmedNumber;

    /** 今日新增治愈人数 */
    private Integer newCureNumber;


    /** 该条记录统计时间 */
    private Date recordTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getConfirmedNumber() {
        return confirmedNumber;
    }

    public void setConfirmedNumber(Integer confirmedNumber) {
        this.confirmedNumber = confirmedNumber;
    }

    public Integer getSuspectedNumber() {
        return suspectedNumber;
    }

    public void setSuspectedNumber(Integer suspectedNumber) {
        this.suspectedNumber = suspectedNumber;
    }

    public Integer getSevereNumber() {
        return severeNumber;
    }

    public void setSevereNumber(Integer severeNumber) {
        this.severeNumber = severeNumber;
    }

    public Integer getCureNumber() {
        return cureNumber;
    }

    public void setCureNumber(Integer cureNumber) {
        this.cureNumber = cureNumber;
    }

    public Integer getDeathNumber() {
        return deathNumber;
    }

    public void setDeathNumber(Integer deathNumber) {
        this.deathNumber = deathNumber;
    }

    public Integer getOverseasImportNumber() {
        return overseasImportNumber;
    }

    public void setOverseasImportNumber(Integer overseasImportNumber) {
        this.overseasImportNumber = overseasImportNumber;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Integer getNewDeathNumber() {
        return newDeathNumber;
    }

    public void setNewDeathNumber(Integer newDeathNumber) {
        this.newDeathNumber = newDeathNumber;
    }

    public Integer getNewConfirmedNumber() {
        return newConfirmedNumber;
    }

    public void setNewConfirmedNumber(Integer newConfirmedNumber) {
        this.newConfirmedNumber = newConfirmedNumber;
    }

    public Integer getNewCureNumber() {
        return newCureNumber;
    }

    public void setNewCureNumber(Integer newCureNumber) {
        this.newCureNumber = newCureNumber;
    }
}
