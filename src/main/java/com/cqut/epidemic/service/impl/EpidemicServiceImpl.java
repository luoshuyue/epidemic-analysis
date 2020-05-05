package com.cqut.epidemic.service.impl;

import com.cqut.epidemic.dao.EpidemicMapper;
import com.cqut.epidemic.dto.*;
import com.cqut.epidemic.service.EpidemicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 罗舒月
 * @Describe
 * @date 2020/4/26 12:23 下午
 */
@Service
public class EpidemicServiceImpl implements EpidemicService {
    @Autowired
    EpidemicMapper epidemicMapper;

    @Override
    public List<DomesticEpidemicDTO> getDomesticEpidemic() {
        List<DomesticEpidemicDTO> domesticEpidemicDTO = epidemicMapper.getDomesticEpidemic();
        return domesticEpidemicDTO;
    }

    @Override
    public List<ProvincesEpidemicDTO> getProvincesEpidemic() {
        List<ProvincesEpidemicDTO> provincesEpidemicDTOS = epidemicMapper.getProvincesEpidemic();
        return provincesEpidemicDTOS;
    }

    @Override
    public List<NewDomesticEpidemicDTO> getDynamicGrowth() {
        List<NewDomesticEpidemicDTO> newDomesticEpidemicDTOS = epidemicMapper.getDynamicGrowth();
        return newDomesticEpidemicDTOS;
    }

    @Override
    public List<EpidemicDistributionDTO> getEpidemicDistribution() {
        List<EpidemicDistributionDTO> epidemicDistributionDTOS = epidemicMapper.getEpidemicDistribution();
        return epidemicDistributionDTOS;
    }

    @Override
    public List<EpidemicGrowthAreaDTO> getEpidemicGrowthArea() {
        List<EpidemicGrowthAreaDTO> epidemicGrowthAreaDTOS = epidemicMapper.getEpidemicGrowthArea();
        return epidemicGrowthAreaDTOS;
    }

    @Override
    public List<EpidemicAreaDTO> getEpidemicArea() {
        List<EpidemicAreaDTO> epidemicAreaDTOS = epidemicMapper.getEpidemicArea();
        return epidemicAreaDTOS;
    }
}
