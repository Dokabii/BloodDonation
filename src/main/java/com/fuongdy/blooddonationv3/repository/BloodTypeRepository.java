package com.fuongdy.blooddonationv3.repository;

import com.fuongdy.blooddonationv3.model.entity.BloodType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodTypeRepository extends JpaRepository<BloodType, Integer> {
}