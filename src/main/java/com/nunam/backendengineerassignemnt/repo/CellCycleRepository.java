package com.nunam.backendengineerassignemnt.repo;

import com.nunam.backendengineerassignemnt.entity.CellCycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CellCycleRepository extends JpaRepository<CellCycle, Long> {
}
