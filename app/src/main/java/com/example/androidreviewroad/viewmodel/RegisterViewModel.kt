package com.example.androidreviewroad.viewmodel

import android.content.Intent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidreviewroad.NftApplication
import com.example.androidreviewroad.database.RegisterDatabase
import com.example.androidreviewroad.model.Register
import com.example.androidreviewroad.ui.LoginActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RegisterViewModel : ViewModel() {

    private val registerList: ArrayList<Register> = ArrayList()

    fun addRegister(registerDatabase: RegisterDatabase, register: Register) {
        val registerDao = registerDatabase.registerDao()

        registerList.add(register)

        viewModelScope.launch(Dispatchers.Default) {
            if (registerDao.inRegisterDatabase(register.account).isEmpty()) {
                registerDao.insertRegister(register)
                val intent = Intent(NftApplication.context, LoginActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                NftApplication.context.startActivity(intent)
            }
        }
    }
}
