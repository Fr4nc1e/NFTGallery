package com.example.androidreviewroad.viewmodel

import android.content.Intent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidreviewroad.NftApplication
import com.example.androidreviewroad.database.RegisterDatabase
import com.example.androidreviewroad.ui.MainActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {

    fun login(registerDatabase: RegisterDatabase, account: Int, passWd: Int) {
        val registerDao = registerDatabase.registerDao()

        viewModelScope.launch(Dispatchers.Default) {
            if (registerDao.inLoginDatabase(account, passWd).isNotEmpty()) {
                val intent = Intent(NftApplication.context, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                NftApplication.context.startActivity(intent)
            }
        }
    }
}
