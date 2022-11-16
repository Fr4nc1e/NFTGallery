package com.example.androidreviewroad

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidreviewroad.adapter.NftAdapter
import com.example.androidreviewroad.database.NftDatabase
import com.example.androidreviewroad.databinding.ActivityMainBinding
import com.example.androidreviewroad.viewmodel.NftDetailViewModel
import com.example.androidreviewroad.viewmodel.NftViewModel
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val desList: List<String> by lazy {
        nftDetailViewModel.initDesList()
    }

    private val nftViewModel: NftViewModel by lazy {
        ViewModelProvider(this)[NftViewModel::class.java]
    }

    private val nftDetailViewModel: NftDetailViewModel by lazy {
        ViewModelProvider(this)[NftDetailViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        val nftDatabase = NftDatabase.getDatabase()
        val nftList = nftViewModel.initNft(nftDatabase, desList)

        val layoutManager = LinearLayoutManager(NftApplication.context)
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = layoutManager
        val adapter = NftAdapter(nftList)
        recyclerView.adapter = ScaleInAnimationAdapter(adapter)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbarmenu, menu)
        return true
    }
}
