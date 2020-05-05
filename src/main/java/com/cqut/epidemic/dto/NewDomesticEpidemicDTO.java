package com.cqut.epidemic.dto;

/**
 * @author 罗舒月
 * @Describe 新增疫情数据 —— 全国数据
 * @date 2020/5/1 9:08 下午
 */
public class NewDomesticEpidemicDTO {

    /** 今日新增死亡人数 */
    private Integer newDeathNumber;

    /** 今日新增确诊人数 */
    private Integer newConfirmedNumber;

    /** 今日新增治愈人数 */
    private Integer newCureNumber;

    /**今日新增境外输入病例 */
    private Integer newOverseasImportNumber;

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

    public Integer getNewOverseasImportNumber() {
        return newOverseasImportNumber;
    }

    public void setNewOverseasImportNumber(Integer newOverseasImportNumber) {
        this.newOverseasImportNumber = newOverseasImportNumber;
    }
}
