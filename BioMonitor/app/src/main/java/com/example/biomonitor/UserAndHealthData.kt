package com.example.biomonitor

import androidx.room.Embedded
import androidx.room.Relation

data class UserAndHealthData(
    @Embedded val user: UserEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "userId"
    )
    val healthdata: HealthDataEntity
)