package com.example.androidreviewroad.adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidreviewroad.NftDetail
import com.example.androidreviewroad.databinding.NftItemBinding
import com.example.androidreviewroad.model.NFT

class NftAdapter(private val nftList: List<NFT>) : RecyclerView.Adapter<NftAdapter.ViewHolder>() {

    private lateinit var binding: NftItemBinding

    inner class ViewHolder(binding: NftItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val nftImage: ImageView = binding.nftImage
        val nftName: TextView = binding.nftName
        val nftPrice: TextView = binding.nftPrice
        val nftArtist: TextView = binding.nftArtist
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = NftItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        val viewHolder = ViewHolder(binding).apply {
            nftImage.setOnClickListener {
                val position = absoluteAdapterPosition
                val nft = nftList[position]
                val intent = Intent(parent.context, NftDetail::class.java)
                intent.putExtra("imageId", nft.imageId)
                intent.putExtra("Description", nft.des)
                parent.context.startActivity(intent)
            }
        }

        return viewHolder
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nft = nftList[position]
        Glide.with(binding.root).load(nft.imageId).into(holder.nftImage)
        holder.nftName.text = nft.name
        holder.nftPrice.text = "$ ${nft.price}"
        holder.nftArtist.text = "by ${nft.artist}"
    }

    override fun getItemCount() = nftList.size
}
