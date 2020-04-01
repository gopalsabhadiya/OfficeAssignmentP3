package com.airline.host.repository;

import com.airline.host.entity.SeatMatrix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatMatrixRepository extends JpaRepository<SeatMatrix, Integer> {
}
