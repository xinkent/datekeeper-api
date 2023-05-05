package com.xinkent.datekeeper.infrastructure.repository

import com.xinkent.datekeeper.infrastructure.entity.DateSpot
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DateSpotRepository : JpaRepository<DateSpot, Long>{

}