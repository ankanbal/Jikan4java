package com.github.doomsdayrs.jikan4java.data.model.support.stats

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.doomsdayrs.jikan4java.data.model.support.stats.score.Score

data class AnimeStats(
		@JsonProperty("request_hash") override val request_hash: String?,
		@JsonProperty("request_cached") override val request_cached: Boolean,
		@JsonProperty("request_cache_expiry") override val request_cache_expiry: Int,
		@JsonProperty("completed") override val completed: Int,
		@JsonProperty("on_hold") override val on_hold: Int,
		@JsonProperty("dropped") override val dropped: Int,
		@JsonProperty("plan_to_watch") val plan_to_watch: Int,
		@JsonProperty("total") override val total: Int,
		@JsonProperty("scores") override val scores: List<Score>,
		@JsonProperty("watching") val watching: Int
) : Stats