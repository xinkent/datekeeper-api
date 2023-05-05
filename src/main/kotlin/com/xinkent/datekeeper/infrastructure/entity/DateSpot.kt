package com.xinkent.datekeeper.infrastructure.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "DATE_SPOTS")
data class DateSpot (
    @Id
    @GeneratedValue
    @Column(name="id")
    val id: Long = 0,

    @Column(name="spot_name", nullable=true)
    val spot_name: String? = "",

    @Column(name="priority")
    val priority: Int? = 0
)