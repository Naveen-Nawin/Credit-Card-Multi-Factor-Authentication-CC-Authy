package com.project.creditPay.responsiveLayer.responses

import com.google.gson.annotations.SerializedName
import com.project.creditPay.responsiveLayer.models.CardDetails

data class CardResponses (
    @SerializedName("error"   ) var error   : Boolean?        = null,
    @SerializedName("message" ) var message : String?         = null,
    @SerializedName("data"    ) var data    : ArrayList<CardDetails> = arrayListOf()
)
