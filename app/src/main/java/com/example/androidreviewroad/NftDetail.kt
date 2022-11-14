package com.example.androidreviewroad

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.androidreviewroad.databinding.ActivityNftDetailBinding

class NftDetail : AppCompatActivity() {

    private lateinit var binding: ActivityNftDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNftDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imageId = intent.getIntExtra("imageId", 0)
        val des = intent.getStringExtra("Description")
        Glide.with(this).load(imageId).into(binding.nftDetailImage)
        binding.nftDes.text = des
    }
}
