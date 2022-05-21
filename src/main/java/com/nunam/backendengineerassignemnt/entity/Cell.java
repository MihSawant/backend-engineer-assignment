package com.nunam.backendengineerassignemnt.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cell")
public class Cell implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "cell_id", unique = true)
    private String cellId;

    @NotNull
    @Column(name = "nominal_capacity")
    private int nominalCapacity;

    @NotNull
    @Column(name = "discharge_capacity")
    private double dischargeCapacity;

}
