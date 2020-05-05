package com.cqut.epidemic.service;

import com.cqut.epidemic.dto.*;

import java.util.List;

/**
 * @author 罗舒月
 * @Describe
 * @date 2020/4/26 12:23 下午
 */
public interface EpidemicService {
    /**
     * 获取总共国内疫情统计
     * @return
     */
    List<DomesticEpidemicDTO> getDomesticEpidemic();

    /**
     * 获取各省市总共疫情统计
     * @return
     */
    List<ProvincesEpidemicDTO> getProvincesEpidemic();

    /**
     * 获取全国的疫情新增数据
     * @return
     */
    List<NewDomesticEpidemicDTO> getDynamicGrowth();

    /**
     * 获取疫情分布情况 针对湖北 / 非湖北
     * @return
     */
    List<EpidemicDistributionDTO> getEpidemicDistribution();

    /**
     * 获取疫情速增地区 前十
     * @return
     */
    List<EpidemicGrowthAreaDTO> getEpidemicGrowthArea();

    /**
     * 获取疫情严重地区 前十
     * @return
     */
    List<EpidemicAreaDTO> getEpidemicArea();
}
