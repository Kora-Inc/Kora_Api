package com.kora.koramonoapi.IAM.domain.persistence;

import com.kora.koramonoapi.IAM.domain.model.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
    Optional<Patient> findById(Integer patientId);
    Optional<Patient> findByEmail(String email);

}
