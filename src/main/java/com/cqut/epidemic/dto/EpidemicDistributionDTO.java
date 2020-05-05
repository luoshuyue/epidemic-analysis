package com.cqut.epidemic.dto;

/**
 * @author 罗舒月
 * @Describe 疫情分布
 * @date 2020/5/1 9:26 下午
 */
public class EpidemicDistributionDTO {

    /** 湖北死亡病例 */
    private Integer hubeiDeathNumber;

    /** 非湖北死亡病例 */
    private Integer notHubeiDeathNumber;

    /** 湖北治愈病例 */
    private Integer hubeiCureNumber;

    /** 非湖北治愈病例 */
    private Integer notHubeiCureNumber;

    /** 湖北确诊病例 */
    private Integer hubeiConfirmedNumber;

    /** 非湖北确诊病例 */
    private Integer notHubeiConfirmedNumber;

    public Integer getHubeiDeathNumber() {
        return hubeiDeathNumber;
    }

    public void setHubeiDeathNumber(Integer hubeiDeathNumber) {
        this.hubeiDeathNumber = hubeiDeathNumber;
    }

    public Integer getNotHubeiDeathNumber() {
        return notHubeiDeathNumber;
    }

    public void setNotHubeiDeathNumber(Integer notHubeiDeathNumber) {
        this.notHubeiDeathNumber = notHubeiDeathNumber;
    }

    public Integer getHubeiCureNumber() {
        return hubeiCureNumber;
    }

    public void setHubeiCureNumber(Integer hubeiCureNumber) {
        this.hubeiCureNumber = hubeiCureNumber;
    }

    public Integer getNotHubeiCureNumber() {
        return notHubeiCureNumber;
    }

    public void setNotHubeiCureNumber(Integer notHubeiCureNumber) {
        this.notHubeiCureNumber = notHubeiCureNumber;
    }

    public Integer getHubeiConfirmedNumber() {
        return hubeiConfirmedNumber;
    }

    public void setHubeiConfirmedNumber(Integer hubeiConfirmedNumber) {
        this.hubeiConfirmedNumber = hubeiConfirmedNumber;
    }

    public Integer getNotHubeiConfirmedNumber() {
        return notHubeiConfirmedNumber;
    }

    public void setNotHubeiConfirmedNumber(Integer notHubeiConfirmedNumber) {
        this.notHubeiConfirmedNumber = notHubeiConfirmedNumber;
    }
}
