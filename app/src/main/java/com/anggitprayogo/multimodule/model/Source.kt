package com.anggitprayogo.multimodule.model
import com.google.gson.annotations.SerializedName


/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
data class Source(
    @SerializedName("sources")
    val sources: List<SourceX?>?,
    @SerializedName("status")
    val status: String? // ok
)

data class SourceX(
    @SerializedName("category")
    val category: String?, // general
    @SerializedName("country")
    val country: String?, // is
    @SerializedName("description")
    val description: String?, // ynet דף הבית: אתר החדשות המוביל בישראל מבית ידיעות אחרונות. סיקור מלא של חדשות מישראל והעולם, ספורט, כלכלה, תרבות, אוכל, מדע וטבע, כל מה שקורה וכל מה שמעניין ב ynet.
    @SerializedName("id")
    val id: String?, // ynet
    @SerializedName("language")
    val language: String?, // he
    @SerializedName("name")
    val name: String?, // Ynet
    @SerializedName("url")
    val url: String? // http://www.ynet.co.il
)