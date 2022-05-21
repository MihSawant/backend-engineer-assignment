package com.nunam.backendengineerassignemnt.service;

import com.nunam.backendengineerassignemnt.entity.*;
import com.nunam.backendengineerassignemnt.repo.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

//@Service
public class DatabaseLoaderService {
    private final CellRepository cellRepository;
    private final CellDetailRepository cellDetailRepository;

    private final CellStatusRepository cellStatusRepository;
    private final CellCycleRepository cellCycleRepository;

    public DatabaseLoaderService(CellRepository cr, CellDetailRepository cd,
                                 CellStatusRepository cs, CellCycleRepository cc) {
        this.cellRepository = cr;
        this.cellDetailRepository = cd;
        this.cellStatusRepository = cs;
        this.cellCycleRepository = cc;
    }

//    @PostConstruct
    public void loadData(){
        Cell one = new Cell();
        one.setId(1);
        one.setCellId("5308");
        one.setDischargeCapacity(2992.02);
        one.setNominalCapacity(3000);

        Cell two = new Cell();
        two.setId(2);
        two.setCellId("5329");
        two.setDischargeCapacity(2822.56);
        two.setNominalCapacity(3000);

        List<Cell> cellsList = List.of(one, two);
        cellRepository.saveAll(cellsList);

        CellCycle cycleOne = new CellCycle();
        cycleOne.setId(1);
        cycleOne.setChannel(1L);
        cycleOne.setTotalOfCycle(1);
        cycleOne.setCapacityOfCharge(0.000);
        cycleOne.setCapacityOfDischarge(0.025);
        cycleOne.setCycleLife(100);
        cycleOne.setCell(one);

        cellCycleRepository.save(cycleOne);

        CellStatus statusOne = new CellStatus();
        statusOne.setRawStepId(1);
        statusOne.setCellCycle(cycleOne);
        statusOne.setStep(1);
        statusOne.setStatus("Rest");
        statusOne.setStartVoltage(3.59);
        statusOne.setEndVoltage(3.59);
        statusOne.setStartCurrent(0);
        statusOne.setEndCurrent(0);
        statusOne.setCapacity(0);
        statusOne.setEndureTime("0:00:05.000");
        statusOne.setRelativeTime("0:00:05.000");
        statusOne.setAbsoluteTime("11/15/2019 19:28:43");
        statusOne.setDischargeCapacity(0);
        statusOne.setChargeCapacity(0);
        statusOne.setNetEnergyDischarge(0);
        statusOne.setNetEnergyCharge(0);

        statusOne.setCell(one);

        cellStatusRepository.save(statusOne);





        CellDetail cellDetail = new CellDetail();
        cellDetail.setStatus("Rest");
        cellDetail.setJumpTo(1);
        cellDetail.setCycle(cycleOne);
        cellDetail.setCurrent(0);
        cellDetail.setVoltage(3.59);
        cellDetail.setCapacity(0);
        cellDetail.setEnergy(0);
        cellDetail.setRelativeTime("0:00:00.000");
        cellDetail.setAbsoluteTime("11/15/2019 19:28:43");
        cellDetail.setAuxilaryVoltageTemp(-0.0032);
        cellDetail.setGapOfVoltage(0);
        cellDetail.setAuxilaryTemp(37.4);
        cellDetail.setGapOfTemprature(0);
        cellDetail.setCell(one);


        cellDetailRepository.save(cellDetail);


    }
}
