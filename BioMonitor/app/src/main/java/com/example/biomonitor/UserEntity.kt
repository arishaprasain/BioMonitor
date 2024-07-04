package com.example.biomonitor

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    var firstName: String?,
    var lastName: String?,
    var password: String?,
    var email: String?
) {
    // No-arg constructor for Room
    constructor() : this(0, null, null, null, null)

    // Constructor to initialize with data
    constructor(firstName: String?, lastName: String?, password: String?, email: String?) :
            this(0, firstName, lastName, password, email)


}