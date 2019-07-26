package com.anggitprayogo.feature_tech.data.entity

import com.google.gson.annotations.SerializedName

/**
 * Created by Anggit Prayogo on 2019-07-26.
 */
data class TechEntity(
    @SerializedName("articles")
    val articles: List<Article?>?,
    @SerializedName("status")
    val status: String?, // ok
    @SerializedName("totalResults")
    val totalResults: Int? // 70
)

data class Article(
    @SerializedName("author")
    val author: String?, // Nick Vivarelli, Nick Vivarelli
    @SerializedName("content")
    val content: String?, // A robust roster of awards contenders, including Brad Pitt space odyssey “Ad Astra” and Steven Soderbergh’s star-studded financial thriller “The Laundromat,” will launch from the Venice Film Festival, which features a bit less high-wattage Hollywood fare this … [+8947 chars]
    @SerializedName("description")
    val description: String?, // A robust roster of awards contenders, including Brad Pitt space odyssey “Ad Astra” and Steven Soderbergh’s star-studded financial thriller “The Laundromat,” will launch from the Venice Film Festiva…
    @SerializedName("publishedAt")
    val publishedAt: String?, // 2019-07-25T08:58:00Z
    @SerializedName("source")
    val source: Source?,
    @SerializedName("title")
    val title: String?, // ‘Joker,’ ‘Ad Astra,’ ‘The Laundromat,’ ‘Marriage Story’ to Compete in Venice - Variety
    @SerializedName("url")
    val url: String?, // https://variety.com/2019/film/news/venice-film-festival-lineup-the-truth-ad-astra-marriage-story-1203277662/
    @SerializedName("urlToImage")
    val urlToImage: String? // https://pmcvariety.files.wordpress.com/2019/07/marriage-story.jpg?w=700&h=393&crop=1
)

data class Source(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String? // Variety.com
)