package com.reportApp.repository;

import com.reportApp.entity.CitizenPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer> {
}