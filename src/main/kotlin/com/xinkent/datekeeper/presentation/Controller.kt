package com.xinkent.datekeeper.presentation

import com.xinkent.datekeeper.infrastructure.entity.DateSpot
import com.xinkent.datekeeper.service.DateSpotService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller (private val dateSpotService: DateSpotService){
    @GetMapping("/datespots/")
    fun findAllDateSpots(): List<DateSpot> {
        return dateSpotService.findAllDateSpots()
    }
}