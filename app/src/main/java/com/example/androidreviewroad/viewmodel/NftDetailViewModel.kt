package com.example.androidreviewroad.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NftDetailViewModel : ViewModel() {

    private val desList: ArrayList<String> = ArrayList()

    private val desListOut by lazy {
        desList
    }

    fun initDesList(): List<String> {
        viewModelScope.launch(Dispatchers.Default) {
            desList.apply {
                add("Beeple’s artwork “Every day” was before the end of 2021 the most expensive NFT art sold, until the artist Pak decides otherwise. The artwork “The Merge” is an NFT sold for the outrageous sum of \$ 91.8 Million via Nifty Gateway. However, the difference lies upon the fact that this NFT was not bought by one, but rather 29,983 people, so “the Merge” sold out being split into 312,686 coins distributed to buyers.")
                add("This Beeple’s artwork was the most expensive sold NFT-art until the end of 2021. “Everyday” NFT is a painting that collects all 5,000 images he drew over 5,000 days in a row. This unique piece was auctioned by the famous Christie house for the tidy sum of \$69 million. This NFT was bought by Vignesh Sundaresan who forestalled Justin Sun, founder of Tron.")
                add("This expensive token was created to support a social cause. Created by Wikileaks founder Assange, this NFT represents a digital counter of the days Julian Assange spent in London’s Belmarsh prison, awaiting extradition to the United States on espionage charges. “Clock” was intended to raise funds to castigate Assange’s imprisonment and was auctioned off for over \$52 million. 10,000 AssangeDAO members owned a share of this NFT as with “The Merge” NFT. Proceeds from the auction were donated to the Holland Foundation, which has been supporting Assange’s defense. This NFT initiative joins Edward Snowden’s initiative in favor of freedom of speech.")
                add("“Human One” is the second most expensive artwork of Beeple, who is second in the ranking of artists with the highest NFT sales volume. Auctioned through Christie’s for \$28.98 million, “Human One” is a life-size 3D NFT that features an individual sporting a spacesuit that changes color (bronze or silver) according to the artist’s wishes. Beeple told he will upgrade this artwork throughout its life, so that this piece of art remains dynamic and crosses time.")
                add("This NFT is the most expensive of the entire CryptoPunks collection of this studio. Cryptopunks are also popular because they convey a particular nostalgia of the 80s, pop, punk, super pixelated video games. In this collection of 10,000 cryptopunks, the rarest coins are those that have the most unique characteristics. Cryptopunks basically come in humanoid forms, and some of the rarest pieces are zombies, monkeys and aliens. Aliens cryptopunks are the most expensive in this case due to the fact that there are only 9 of them in the 10,000 collection.\nThis cryptopunk #5822 is one of the nine aliens and wears a blue bandana. Its value mainly comes from the fact that it is an alien.")
                add("Previously the highest in price of the cryptopunks collection, the value of cryptopunk #7523 comes from the fact that it has extremely rare characteristics: it is the only crypto that wears a surgical mask, which is eminently reminiscent of the pandemic, and it is one of the 9 super rare aliens. And in art, the rarer and more unique, the more expensive it is.")
                add("This cryptopunk is unique because it belongs to exclusives: it is one of the 24 cryptopunks monkeys, and this NFT is adorned with a blue bandana and is estimated to be worth \$10.35 million. Fun fact about this NFT is its value jumped in just almost one month from \$1.17 million to \$10.35 million.")
                add(
                    "This is the third of the most expensive NFTs from Larva Labs if we use ether tokens. This cryptopunk is one of the 9 aliens punks, which hence explains its exponential value. It has been fleshed out with other characteristics that make it unique: he smokes a pipe, wears a beret and sunglasses, which makes him an extremely rare piece. In the collection of 10,000 cryptopunks, there are only 378 pipe smokers, 317 with shade variations and 254 wearing forward caps.\n" +
                        "\n" +
                        "This auctioned work was purchased by Dylan Field, CEO of Figma, a software company."
                )
                add(
                    "It goes without saying that Larva Labs artworks are establishing themselves in the NFT-art market. Cryptopunk # 3100 is so expensive because it’s the only punk who wears a blindfold.\n" +
                        "\n" +
                        "Sold at 7.51 million dollars, the buyer of this crypto put it up for sale for a staggering sum of 90.5 millions dollars, so 35,000 ether. If anyone bought it, this crypto would become the most expensive piece of digital art sold in the world."
                )
            }
        }.cancel()

        return desListOut
    }
}
