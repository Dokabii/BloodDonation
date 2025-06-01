package com.fuongdy.blooddonationv3.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "blood_types",
        uniqueConstraints = {
                @UniqueConstraint(name = "UQ_blood_group_rh", columnNames = {"blood_group", "rh_factor"})
        })
@Getter
@Setter
@NoArgsConstructor
public class BloodType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "blood_group", length = 2, nullable = false)
    private String bloodGroup;

    @Column(name = "rh_factor", length = 1, nullable = false)
    private String rhFactor;

    @Column(name = "description", length = 50)
    private String description;
}