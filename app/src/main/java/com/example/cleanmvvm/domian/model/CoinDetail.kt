package com.example.cleanmvvm.domian.model

import com.example.cleanmvvm.data.remote.dto.TeamMembers

data class CoinDetail(
    val id: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val is_active: Boolean,
    val tags: List<String>,
    val team: List<TeamMembers>
)
