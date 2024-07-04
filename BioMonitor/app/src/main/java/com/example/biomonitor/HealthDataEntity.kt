package com.example.biomonitor

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "healthData")
data class HealthDataEntity(
    @PrimaryKey val id: Long = 0,
    val userId: Long, // Foreign key to link with UserEntity
    val heartRate: Int,
    val temperature: Float,
    // Add other health-related fields as needed
)

