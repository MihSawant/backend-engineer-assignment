package com.nunam.backendengineerassignemnt.service;

import com.nunam.backendengineerassignemnt.repo.CellDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    private final CellDetailRepository cellDetailRepository;

    public DashboardService(CellDetailRepository cellDetailRepository){
        this.cellDetailRepository = cellDetailRepository;
    }

   public List<Double> allCurrentsById(Long id){
        return cellDetailRepository.getCurrentById(id);
   }

   public List<Double> allVoltagesById(Long id){
        return cellDetailRepository.getVoltageById(id);
   }

   public List<Double> allCapacitiesById(Long id){
        return cellDetailRepository.getCapacityById(id);
   }

   public List<Double> allTemperaturesById(Long id){
        return cellDetailRepository.getTempratureById(id);
   }

   public List<String> allTimesById(Long id){
        return cellDetailRepository.getTimeById(id);
   }


}
