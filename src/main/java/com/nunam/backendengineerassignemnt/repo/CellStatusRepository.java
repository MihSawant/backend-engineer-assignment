package com.nunam.backendengineerassignemnt.repo;

import com.nunam.backendengineerassignemnt.entity.CellStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CellStatusRepository extends JpaRepository<CellStatus, Long> {

}
