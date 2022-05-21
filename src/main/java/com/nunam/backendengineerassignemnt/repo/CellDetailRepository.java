package com.nunam.backendengineerassignemnt.repo;

import com.nunam.backendengineerassignemnt.entity.CellDetail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CellDetailRepository extends PagingAndSortingRepository<CellDetail, Long> {

    @Query(value = "SELECT vol FROM batteries.celldetail WHERE cell_id = :id", nativeQuery = true)
    List<Double> getVoltageById(@Param("id") Long id);

    @Query(value = "SELECT aux_channel_temp FROM batteries.celldetail WHERE cell_id = :id", nativeQuery = true)
    List<Double> getTempratureById(@Param("id") Long id);

    @Query(value = "SELECT capacity FROM batteries.celldetail WHERE cell_id = :id", nativeQuery = true)
    List<Double> getCapacityById(@Param("id") Long id);

    @Query(value = "SELECT curr FROM batteries.celldetail WHERE cell_id = :id", nativeQuery = true)
    List<Double> getCurrentById(@Param("id") Long id);

    @Query(value = "SELECT absolute_time FROM batteries.celldetail WHERE cell_id = :id", nativeQuery = true)
    List<String> getTimeById(@Param("id") Long id);
}
