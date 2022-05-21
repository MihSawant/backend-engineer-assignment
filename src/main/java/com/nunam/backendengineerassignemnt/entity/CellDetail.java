package com.nunam.backendengineerassignemnt.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cell_detail")
public class CellDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long recordIndex;


    @NotNull
    @Column(name = "status")
    private String status;


    @NotNull
    @Column(name = "jump_to")
    private int jumpTo;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "cell_cycle_id")
    private CellCycle cycle;

    @NotNull
    @Column(name = "step")
    private int step;

    @NotNull
    @Column(name = "curr")
    private double current;

    @NotNull
    @Column(name = "vol")
    private double voltage;

    @ManyToOne
    private Cell cell;

    @NotNull
    @Column(name = "capacity")
    private double capacity;

    @NotNull
    @Column(name = "energy")
    private double energy;

    @NotNull
    @Column(name = "absolute_time")
    private String absoluteTime;

    @NotNull
    @Column(name = "relative_time")
    private String relativeTime;

    @NotNull
    @Column(name = "aux_channel_vol")
    private double auxilaryVoltageTemp;
    @NotNull
    @Column(name = "gap_of_voltage")
    private double gapOfVoltage;

    @NotNull
    @Column(name = "aux_channel_temp")
    private double auxilaryTemp;

    @Column(name = "gap_of_temprature")
    private double gapOfTemprature;

}
