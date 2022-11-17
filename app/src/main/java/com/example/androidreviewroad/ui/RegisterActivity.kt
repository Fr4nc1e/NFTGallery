package com.example.androidreviewroad.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.androidreviewroad.database.RegisterDatabase
import com.example.androidreviewroad.databinding.ActivityRegisterBinding
import com.example.androidreviewroad.model.Register
import com.example.androidreviewroad.viewmodel.RegisterViewModel

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    private val registerViewModel: RegisterViewModel by lazy {
        ViewModelProvider(this)[RegisterViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val registerDatabase = RegisterDatabase.getDatabase()

        binding.register.setOnClickListener {
            val register = Register(
                binding.registerAccountEdit.text.toString().hashCode(),
                binding.registerPasswordEdit.text.toString().hashCode(),
                binding.registerPhoneNumberEdit.text.toString().hashCode()
            )
            registerViewModel.addRegister(registerDatabase, register)
        }
    }
}
