package com.example.androidreviewroad.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidreviewroad.R
import com.example.androidreviewroad.database.NftDatabase
import com.example.androidreviewroad.model.NFT
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

class NftViewModel : ViewModel() {

    private val nftList: ArrayList<NFT> = ArrayList()

    private val nftListOut by lazy {
        nftList
    }

    fun initNft(database: NftDatabase, desList: List<String>): ArrayList<NFT> {
        val nftDao = database.nftDao()

        viewModelScope.launch(Dispatchers.Default) {
            nftList.apply {
                add(NFT("THE MERGE", R.drawable.the_merge_pak_nft_metav_rs__715x461_png, 91800000, "Pak", desList[0]))
                add(NFT("BEEPLE COLLECTION _ EVERY DAY: THE FIRST FIVE THOUSAND DAYS", R.drawable.the_first_five_thousand_day_beeple_metav_rs_nft_715x715, 69346250, "Mike Winkelmann aka Beeple", desList[1]))
                add(NFT("CLOCK", R.drawable.clocks_expensive_nfts_sold_png, 52740000, "Julian Assange and Pak", desList[2]))
                add(NFT("HUMAN ONE", R.drawable.human_one_beeple_nft_metav_rs__715x432_png, 28985000, "Mike Winkelmann aka Beeple", desList[3]))
                add(NFT("CRYPTOPUNK #5822", R.drawable.cryptopunk_5822_expensive_nfts, 23700000, "Matt Hall and John Watkinson, Larva Labs’s directors", desList[4]))
                add(NFT("CRYPTOPUNK #7523", R.drawable.cryptopunk7523_metav_rs_nft, 11800000, "Matt Hall and John Watkinson, Larva Labs’s directors", desList[5]))
                add(NFT("CRYPTOPUNK #4156", R.drawable.cryptopunk4156_metav_rs_nft, 10350000, "Matt Hall and John Watkinson, Larva Labs’s directors", desList[6]))
                add(NFT("CRYPTOPUNK #7804", R.drawable.cryptopunk7804_metav_rs_nft, 7560000, "Matt Hall and John Watkinson, Larva Labs’s directors", desList[7]))
                add(NFT("CRYPTOPUNK #3100", R.drawable.cryptopunk3100_metav_rs_nft, 7510000, "Matt Hall and John Watkinson, Larva Labs’s directors", desList[8]))
            }.forEach {
                if (nftDao.inDatabase(it.name).isEmpty()) {
                    nftDao.insertNft(it)
                }
            }
        }

        return nftListOut
    }
}
