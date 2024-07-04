package com.example.biomonitor

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.biomonitor.databinding.ActivityThirdBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ThirdActivity : ComponentActivity() {
    //database variables
    private lateinit var userDao: UserDao
    private lateinit var db: AppDatabase

    //view binding for ui
    private lateinit var binding3: ActivityThirdBinding


    private lateinit var lastName: String
    private lateinit var email : String
    private lateinit var password: String
    private lateinit var firstName: String




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding
        binding3 = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding3.root)

        // Initialize the database instance
        db = AppDatabase.getInstance(applicationContext)
        userDao = db.userDao()




        //  click listener for signupButton
        binding3.signupButton.setOnClickListener{

            //get input values
            lastName = binding3.lastNameEditText.text.toString()
            email = binding3.emailEditText.text.toString()
            firstName = binding3.firstNameEditText.text.toString()
            password = binding3.passwordEditText.text.toString()

            // Log or print the values to check what's stored in the variables
            Log.d("InputValues", "Last Name: $lastName")
            Log.d("InputValues", "Email: $email")
            Log.d("InputValues", "First Name: $firstName")
            Log.d("InputValues", "Password: $password")

//
            // Create a UserEntity object using the constructor
            val newUser = UserEntity(firstName, lastName, password, email)
            // Insert user into the database and get inserted row ID
            // Insert user into the database


            // Retrieve all users from the database and log them
            GlobalScope.launch(Dispatchers.IO) {

                userDao.insert(newUser)
                val users = userDao.getAll()
                users.collect { userList ->
                    for (user in userList) {
                        Log.d("User", "ID: ${user.id}, First Name: ${user.firstName}, Last Name: ${user.lastName}, Email: ${user.email}")
                    }
                }
            }

            // Show toast indicating user insertion (optional)
            Toast.makeText(this@ThirdActivity, "User inserted successfully", Toast.LENGTH_SHORT).show()


//

        }

    }
}