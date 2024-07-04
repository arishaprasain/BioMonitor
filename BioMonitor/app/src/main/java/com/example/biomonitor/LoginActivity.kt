import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.example.biomonitor.databinding.ActivityLoginBinding

class LoginActivity : ComponentActivity() {
    //database variables
//    private lateinit var userDao: UserDao
//    private lateinit var db: AppDatabase

    //view binding for ui
    private lateinit var binding: ActivityLoginBinding


    private lateinit var email: String
    private lateinit var password: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        // Initialize the database instance
//        db = AppDatabase.getInstance(applicationContext)
//        userDao = db.userDao()


        //  click listener for signupButton
        binding.loginButton.setOnClickListener {

            //get input values

            email = binding.emailEditText.text.toString()
            password = binding.passwordEditText.text.toString()

//            // Log or print the values to check what's stored in the variables
//            Log.d("InputValues", "Last Name: $lastName")
            Log.d("InputValues", "Email: $email")
//            Log.d("InputValues", "First Name: $firstName")
            Log.d("InputValues", "Password: $password")

//
            //AUTHENTICATION CODE


        }
    }
}