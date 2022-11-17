package com.example.androidreviewroad.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.androidreviewroad.database.RegisterDatabase
import com.example.androidreviewroad.databinding.ActivityLoginBinding
import com.example.androidreviewroad.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val loginViewModel: LoginViewModel by lazy {
        ViewModelProvider(this)[LoginViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val registerDatabase = RegisterDatabase.getDatabase()

        binding.login.setOnClickListener {
            loginViewModel.login(
                registerDatabase,
                binding.accountEdit.text.toString().hashCode(),
                binding.passwordEdit.text.toString().hashCode()
            )
        }

        binding.loginToRegister.setOnClickListener {
            val intent = Intent(
                this,
                RegisterActivity::class.java
            )
            startActivity(intent)
        }
    }
}
