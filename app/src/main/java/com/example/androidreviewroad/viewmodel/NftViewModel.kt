package com.example.androidreviewroad.viewmodel

import androidx.lifecycle.ViewModel
import com.example.androidreviewroad.NftApplication
import com.example.androidreviewroad.R
import com.example.androidreviewroad.database.NftDatabase
import com.example.androidreviewroad.model.NFT
import kotlin.concurrent.thread

class NftViewModel : ViewModel() {

    private var desList: ArrayList<String> = ArrayList()
    private var nftList: ArrayList<NFT> = ArrayList()

    private fun initDesList(): List<String> {
        desList.add("Beeple’s artwork “Every day” was before the end of 2021 the most expensive NFT art sold, until the artist Pak decides otherwise. The artwork “The Merge” is an NFT sold for the outrageous sum of \$ 91.8 Million via Nifty Gateway. However, the difference lies upon the fact that this NFT was not bought by one, but rather 29,983 people, so “the Merge” sold out being split into 312,686 coins distributed to buyers.")
        desList.add("This Beeple’s artwork was the most expensive sold NFT-art until the end of 2021. “Everyday” NFT is a painting that collects all 5,000 images he drew over 5,000 days in a row. This unique piece was auctioned by the famous Christie house for the tidy sum of \$69 million. This NFT was bought by Vignesh Sundaresan who forestalled Justin Sun, founder of Tron.")
        desList.add("This expensive token was created to support a social cause. Created by Wikileaks founder Assange, this NFT represents a digital counter of the days Julian Assange spent in London’s Belmarsh prison, awaiting extradition to the United States on espionage charges. “Clock” was intended to raise funds to castigate Assange’s imprisonment and was auctioned off for over \$52 million. 10,000 AssangeDAO members owned a share of this NFT as with “The Merge” NFT. Proceeds from the auction were donated to the Holland Foundation, which has been supporting Assange’s defense. This NFT initiative joins Edward Snowden’s initiative in favor of freedom of speech.")
        desList.add("“Human One” is the second most expensive artwork of Beeple, who is second in the ranking of artists with the highest NFT sales volume. Auctioned through Christie’s for \$28.98 million, “Human One” is a life-size 3D NFT that features an individual sporting a spacesuit that changes color (bronze or silver) according to the artist’s wishes. Beeple told he will upgrade this artwork throughout its life, so that this piece of art remains dynamic and crosses time.")
        desList.add("This NFT is the most expensive of the entire CryptoPunks collection of this studio. Cryptopunks are also popular because they convey a particular nostalgia of the 80s, pop, punk, super pixelated video games. In this collection of 10,000 cryptopunks, the rarest coins are those that have the most unique characteristics. Cryptopunks basically come in humanoid forms, and some of the rarest pieces are zombies, monkeys and aliens. Aliens cryptopunks are the most expensive in this case due to the fact that there are only 9 of them in the 10,000 collection.\nThis cryptopunk #5822 is one of the nine aliens and wears a blue bandana. Its value mainly comes from the fact that it is an alien.")
        desList.add("Previously the highest in price of the cryptopunks collection, the value of cryptopunk #7523 comes from the fact that it has extremely rare characteristics: it is the only crypto that wears a surgical mask, which is eminently reminiscent of the pandemic, and it is one of the 9 super rare aliens. And in art, the rarer and more unique, the more expensive it is.")
        desList.add("This cryptopunk is unique because it belongs to exclusives: it is one of the 24 cryptopunks monkeys, and this NFT is adorned with a blue bandana and is estimated to be worth \$10.35 million. Fun fact about this NFT is its value jumped in just almost one month from \$1.17 million to \$10.35 million.")
        desList.add(
            "This is the third of the most expensive NFTs from Larva Labs if we use ether tokens. This cryptopunk is one of the 9 aliens punks, which hence explains its exponential value. It has been fleshed out with other characteristics that make it unique: he smokes a pipe, wears a beret and sunglasses, which makes him an extremely rare piece. In the collection of 10,000 cryptopunks, there are only 378 pipe smokers, 317 with shade variations and 254 wearing forward caps.\n" +
                "\n" +
                "This auctioned work was purchased by Dylan Field, CEO of Figma, a software company."
        )
        desList.add(
            "It goes without saying that Larva Labs artworks are establishing themselves in the NFT-art market. Cryptopunk # 3100 is so expensive because it’s the only punk who wears a blindfold.\n" +
                "\n" +
                "Sold at 7.51 million dollars, the buyer of this crypto put it up for sale for a staggering sum of 90.5 millions dollars, so 35,000 ether. If anyone bought it, this crypto would become the most expensive piece of digital art sold in the world."
        )

        return desList
    }

    fun initNft(): ArrayList<NFT> {
        val desList = initDesList()
        val nftDao = NftDatabase.getDatabase(NftApplication.context).nftDao()
        val nft0 = NFT("THE MERGE", R.drawable.the_merge_pak_nft_metav_rs__715x461_png, 91800000, "Pak", desList[0])
        val nft1 = NFT("BEEPLE COLLECTION _ EVERY DAY: THE FIRST FIVE THOUSAND DAYS", R.drawable.the_first_five_thousand_day_beeple_metav_rs_nft_715x715, 69346250, "Mike Winkelmann aka Beeple", desList[1])
        val nft2 = NFT("CLOCK", R.drawable.clocks_expensive_nfts_sold_png, 52740000, "Julian Assange and Pak", desList[2])
        val nft3 = NFT("HUMAN ONE", R.drawable.human_one_beeple_nft_metav_rs__715x432_png, 28985000, "Mike Winkelmann aka Beeple", desList[3])
        val nft4 = NFT("CRYPTOPUNK #5822", R.drawable.cryptopunk_5822_expensive_nfts, 23700000, "Matt Hall and John Watkinson, Larva Labs’s directors", desList[4])
        val nft5 = NFT("CRYPTOPUNK #7523", R.drawable.cryptopunk7523_metav_rs_nft, 11800000, "Matt Hall and John Watkinson, Larva Labs’s directors", desList[5])
        val nft6 = NFT("CRYPTOPUNK #4156", R.drawable.cryptopunk4156_metav_rs_nft, 10350000, "Matt Hall and John Watkinson, Larva Labs’s directors", desList[6])
        val nft7 = NFT("CRYPTOPUNK #7804", R.drawable.cryptopunk7804_metav_rs_nft, 7560000, "Matt Hall and John Watkinson, Larva Labs’s directors", desList[7])
        val nft8 = NFT("CRYPTOPUNK #3100", R.drawable.cryptopunk3100_metav_rs_nft, 7510000, "Matt Hall and John Watkinson, Larva Labs’s directors", desList[8])
        thread {
            nft0.id = nftDao.insertNft(nft0)
            nft1.id = nftDao.insertNft(nft1)
            nft2.id = nftDao.insertNft(nft2)
            nft3.id = nftDao.insertNft(nft3)
            nft4.id = nftDao.insertNft(nft4)
            nft5.id = nftDao.insertNft(nft5)
            nft6.id = nftDao.insertNft(nft6)
            nft7.id = nftDao.insertNft(nft7)
            nft8.id = nftDao.insertNft(nft8)
            nftDao.getAllNft().forEach {
                nftList.add(it)
            }
        }

        return nftList
    }
}
