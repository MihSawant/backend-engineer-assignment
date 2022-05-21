package com.nunam.backendengineerassignemnt.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cell_cycle")
public class CellCycle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "total_of_cycle")
    private long totalOfCycle;

    @ManyToOne
    private Cell cell;

    @NotNull
    @Column(name = "channel")
    private long channel;

    @NotNull
    @Column(name = "capacity_of_charge")
    private double capacityOfCharge;

    @NotNull
    @Column(name = "capacity_of_discharge")
    private double capacityOfDischarge;

    @NotNull
    @Column(name = "cycle_life")
    private double cycleLife;
}
