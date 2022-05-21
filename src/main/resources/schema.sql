CREATE TABLE cell(
            id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
            cell_id VARCHAR(20) NOT NULL,
            discharge_capacity DOUBLE NOT NULL,
            nominal_capacity INTEGER NOT NULL);
ALTER TABLE cell ADD CONSTRAINT UK_110 UNIQUE(cell_id);
ALTER TABLE cell ADD CONSTRAINT PK_111 UNIQUE(id);

CREATE TABLE cellcycle(
            id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
            capacity_of_charge DOUBLE NOT NULL,
            capacity_of_discharge DOUBLE NOT NULL,
            channel BIGINT NOT NULL,
            cycle_life DOUBLE NOT NULL,
            total_of_cycle BIGINT NOT NULL,
            cell_id BIGINT NOT NULL);
ALTER TABLE cellcycle ADD CONSTRAINT PK_210 UNIQUE(id);
ALTER TABLE cellcycle ADD CONSTRAINT FK_211 FOREIGN KEY (cell_id) REFERENCES cell(id);
















CREATE TABLE celldetail(
            record_index BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
            absolute_time VARCHAR(255) NOT NULL,
            aux_channel_temp DOUBLE NOT NULL,
            aux_channel_vol DOUBLE NOT NULl,
            capacity DOUBLE NOT NULL,
            curr DOUBLE NOT NULL,
            energy DOUBLE NOT NULL,
            gap_of_temprature DOUBLE NOT NULL,
            gap_of_voltage DOUBLE NOT NULL,
            jump_to INTEGER NOT NULL,
            relative_time VARCHAR(255) NOT NULL,
            status VARCHAR(100) NOT NULL,
            step INTEGER NOT NULL,
            vol DOUBLE NOT NULL,
            cell_id BIGINT NOT NULL,
            cell_cycle_id BIGINT NOT NULL
            );

ALTER TABLE celldetail ADD CONSTRAINT UK_301 UNIQUE(record_index);
ALTER TABLE celldetail ADD CONSTRAINT FK_321 FOREIGN KEY(cell_id) REFERENCES cell(id);
ALTER TABLE celldetail ADD CONSTRAINT FK_334 FOREIGN KEY(cell_cycle_id) REFERENCES cellcycle(id);


CREATE TABLE cellstatus(
       cell_cycle_id BIGINT NOT NULL,
       step BIGINT NOT NULL,
       raw_step_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
       status VARCHAR(100) NOT NULL,
       start_voltage DOUBLE NOT NULL,
       end_voltage DOUBLE NOT NULL,
       start_current DOUBLE NOT NULL,
       end_current DOUBLE NOT NULL,
       capacity DOUBLE NOT NULL,
       endure_time VARCHAR(255) NOT NULL,
       relative_time VARCHAR(255) NOT NULL,
       absolute_time VARCHAR(255) NOT NULL,
       discharge_capacity DOUBLE NOT NULL,
       charge_capacity DOUBLE NOT NULL,
       net_energy_discharge DOUBLE NOT NULL,
       energy_charge DOUBLE NOT NULL,
       cell_id BIGINT NOT NULL
);

ALTER TABLE cellstatus ADD CONSTRAINT UK_401 UNIQUE(raw_step_id);
ALTER TABLE cellstatus ADD CONSTRAINT FK_421 FOREIGN KEY(cell_id) REFERENCES cell(id);
ALTER TABLE cellstatus ADD CONSTRAINT FK_434 FOREIGN KEY(cell_cycle_id) REFERENCES cellcycle(id);



