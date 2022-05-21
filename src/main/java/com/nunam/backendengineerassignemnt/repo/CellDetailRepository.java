package com.nunam.backendengineerassignemnt.repo;

import com.nunam.backendengineerassignemnt.entity.CellDetail;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CellDetailRepository extends PagingAndSortingRepository<CellDetail, Long> {

}
