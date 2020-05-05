package com.cqut.epidemic.dto;

import java.util.Date;

/**
 * @author 罗舒月
 * @Describe  国内疫情基本情况
 * @date 2020/4/26 12:17 下午
 */
public class DomesticEpidemicDTO {
    /** ID */
    private Long id;

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
    private Integer overseasImport;

    /** 该条记录统计时间 */
    private Date recordTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getOverseasImport() {
        return overseasImport;
    }

    public void setOverseasImport(Integer overseasImport) {
        this.overseasImport = overseasImport;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}
