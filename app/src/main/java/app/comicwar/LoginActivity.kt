package app.comicwar

import android.os.Bundle

import android.widget.EditText

import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult

import androidx.appcompat.app.AppCompatActivity

import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieConfig

class LoginActivity : AppCompatActivity(R.layout.login_activity_layout) {
    //UI elements
    private lateinit var emailInput: EditText

    //Activity for results callbacks
    private val startActivityForResult = registerForActivityResult(StartActivityForResult()) { result ->

    }

    private val startGoogleAuth = registerForActivityResult(StartActivityForResult()) { result ->
        val intent = result.data

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Lottie.initialize(LottieConfig.Builder()
            .setEnableNetworkCache(false)
            .build()
        )

        emailInput = findViewById(R.id.email_input)

    }

    override fun onStart() {
        super.onStart()


    }
}