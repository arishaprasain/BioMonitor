package com.example.biomonitor

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getAll(): Flow<List<UserEntity>>

    @Insert
    fun insert(user: UserEntity)

    @Query("DELETE FROM users")
    fun deleteAll()

//    @Query(
//        "SELECT * FROM users " +
//                "JOIN healthData ON users.id = healthData.userId"
//    )
//   fun loadUserAndHealthData(): Map<UserEntity, HealthDataEntity>
////
//    @Transaction
//    @Query("SELECT * FROM users ")
//    fun getUsersAndHealthData(): List<UserAndHealthData>


}
