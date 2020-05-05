package com.cqut.epidemic.dto;

/**
 * @author 罗舒月
 * @Describe 疫情严重区域
 * @date 2020/5/1 10:02 下午
 */
public class EpidemicAreaDTO {
    /** 地区名称 */
    private String areaName;

    /** 总数 */
    private Integer total;

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
