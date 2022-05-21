package com.nunam.backendengineerassignemnt.service;

import com.nunam.backendengineerassignemnt.entity.Cell;
import com.nunam.backendengineerassignemnt.repo.CellRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SohCalcService {
    private final CellRepository cellRepository;

    public SohCalcService(CellRepository cellRepository){
        this.cellRepository = cellRepository;
    }


    public List<Double> getSoh(){
       return  cellRepository.findAll().stream()
                .map(this::sohFormula)
                .collect(Collectors.toList());
    }

    private double sohFormula(Cell cell) {
        return (cell.getDischargeCapacity() / cell.getNominalCapacity()) * 100;
    }

}
