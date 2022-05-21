package com.nunam.backendengineerassignemnt.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cell_status")
public class CellStatus implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "raw_step_id")
    private long rawStepId;

    @Column(name = "step")
    private long step;

    @ManyToOne
    @JoinColumn(name = "cell_cycle_id")
    private CellCycle cellCycle;

    @Column(name = "status")
    private String status;

    @ManyToOne
    private Cell cell;

    @Column(name = "start_voltage")
    private double startVoltage;

    @Column(name = "end_voltage")
    private double endVoltage;

    @Column(name = "start_current")
    private double startCurrent;

    @Column(name = "end_current")
    private double endCurrent;

    @Column(name = "capacity")
    private double capacity;

    @Column(name = "endure_time")
    private String endureTime;

    @Column(name = "relative_time")
    private String relativeTime;

    @Column(name = "absolute_time")
    private String absoluteTime;

    @Column(name = "discharge_capacity")
    private double dischargeCapacity;

    @Column(name = "charge_capacity")
    private double chargeCapacity;

    @Column(name = "net_energy_discharge")
    private double netEnergyDischarge;

    @Column(name = "enerygy_charge")
    private double netEnergyCharge;



}
