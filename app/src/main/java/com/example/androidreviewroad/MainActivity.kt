package com.example.androidreviewroad

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidreviewroad.adapter.NftAdapter
import com.example.androidreviewroad.databinding.ActivityMainBinding
import com.example.androidreviewroad.model.NFT
import com.example.androidreviewroad.viewmodel.NftViewModel
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var nftList: List<NFT>
    private lateinit var viewModel: NftViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        viewModel = ViewModelProvider(this).get(NftViewModel::class.java)
        nftList = viewModel.initNft()
        val layoutManager = LinearLayoutManager(this)
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
