package com.xinkent.datekeeper.service

import com.xinkent.datekeeper.infrastructure.repository.DateSpotRepository
import org.springframework.stereotype.Service

@Service
class DateSpotService(private val repository: DateSpotRepository) {
    fun findAllDateSpots() = repository.findAll()
}