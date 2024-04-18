package com.diallo.lab10.repository;

import com.diallo.lab10.model.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SurgeryRepository extends JpaRepository<Surgery, Integer> {
}
