package com.nunam.backendengineerassignemnt.repo;

import com.nunam.backendengineerassignemnt.entity.Cell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CellRepository extends JpaRepository<Cell, Long> {
}
