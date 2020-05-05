package com.cqut.epidemic.controller;

import com.cqut.epidemic.dto.JSONResult;
import com.cqut.epidemic.service.EpidemicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 罗舒月
 * @Describe
 * @date 2020/4/26 11:55 上午
 */
@RestController
@CrossOrigin
@RequestMapping("/epidemic")
public class EpidemicController {

    @Autowired
    EpidemicService epidemicService;

    /**
     * 获取总共国内疫情统计
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getDomesticEpidemic")
    public JSONResult getDomesticEpidemic() {
        return new JSONResult(epidemicService.getDomesticEpidemic());
    }

    /**
     * 获取各省市总共疫情统计
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getProvincesEpidemic")
    public JSONResult getProvincesEpidemic() {
        return new JSONResult(epidemicService.getProvincesEpidemic());
    }

    /**
     * 获取全国的疫情新增数据
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getDynamicGrowth")
    public JSONResult getDynamicGrowth() {
        return new JSONResult(epidemicService.getDynamicGrowth());
    }

    /**
     * 获取疫情分布情况 针对湖北 / 非湖北
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getEpidemicDistribution")
    public JSONResult getEpidemicDistribution() {
        return new JSONResult(epidemicService.getEpidemicDistribution());
    }

    /**
     * 获取疫情速增地区 前十
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getEpidemicGrowthArea")
    public JSONResult getEpidemicGrowthArea() {
        return new JSONResult(epidemicService.getEpidemicGrowthArea());
    }

    /**
     * 获取疫情严重地区 前十
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getEpidemicArea")
    public JSONResult getEpidemicArea() {
        return new JSONResult(epidemicService.getEpidemicArea());
    }


}
