package com.reportApp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "citizen_plan")
public class CitizenPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "citizen_name")
    private String citizenName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "plan_name")
    private String planName;

    @Column(name = "plan_status")
    private String planStatus;

    @Column(name = "plan_StartDate")
    private LocalDate planStartDate;

    @Column(name = "plan_EndDate")
    private LocalDate planEndDate;

    @Column(name = "benifit_Amount")
    private Double benifitAmount;

    @Column(name = "denial_Reason")
    private String denialReason;

    @Column(name = "terminated_Date")
    private LocalDate terminatedDate;

    @Column(name = "termination_Reason")
    private String terminationReason;

}