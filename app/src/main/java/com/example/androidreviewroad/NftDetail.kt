package com.example.androidreviewroad

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.androidreviewroad.animation.CrossFade
import com.example.androidreviewroad.databinding.ActivityNftDetailBinding

class NftDetail : AppCompatActivity() {

    private lateinit var binding: ActivityNftDetailBinding
    private var longAnimationDuration: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNftDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intent.getIntExtra("imageId", 0)
        val des = intent.getStringExtra("Description")
        val nftName = intent.getStringExtra("nftName")
        Glide.with(NftApplication.context).load(imageId).into(binding.nftDetailImage)
        binding.nftDes.text = des
        binding.nftDetailName.text = nftName

        longAnimationDuration = resources.getInteger(android.R.integer.config_longAnimTime)
        CrossFade.crossFade(binding.content, longAnimationDuration)
        CrossFade.crossFade(binding.nftDetailImage, longAnimationDuration)
    }
}
