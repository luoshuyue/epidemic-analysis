package com.cqut.epidemic.dto;

/**
 * @author 罗舒月
 * @Describe 疫情增速区域
 * @date 2020/5/1 9:43 下午
 */
public class EpidemicGrowthAreaDTO {
    /** 省份名称 */
    private String provinceName;

    /** 总数 */
    private Integer total;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
