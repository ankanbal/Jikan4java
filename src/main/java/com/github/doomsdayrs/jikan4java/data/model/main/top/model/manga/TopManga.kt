package com.github.doomsdayrs.jikan4java.data.model.main.top.model.manga

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.doomsdayrs.jikan4java.common.jikanURL
import com.github.doomsdayrs.jikan4java.data.model.main.manga.Manga
import com.github.doomsdayrs.jikan4java.data.model.main.top.base.TopListingMedia
import java.util.concurrent.CompletableFuture

/*
 * This file is part of Jikan4java.
 *
 * Jikan4java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Jikan4java is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Jikan4java.  If not, see <https://www.gnu.org/licenses/>.
 * ====================================================================*/
/**
 * Jikan4java
 * 01 / November / 2018
 *
 * @author github.com/doomsdayrs
 */
data class TopManga(
		@JsonProperty("mal_id") override val malID: Int,
		@JsonProperty("rank") override val rank: Int,
		@JsonProperty("title") override val title: String,
		@JsonProperty("url") override val url: String,
		@JsonProperty("image_url") override val imageURL: String = "",
		@JsonProperty("type") override val type: String,
		@JsonProperty("score") override val score: Double,
		@JsonProperty("members") override val members: Int,
		@JsonProperty("start_date") override val startDate: String,
		@JsonProperty("end_date") override val endDate: String = "",
		@JsonProperty("volumes") val volumes: Int
) : TopListingMedia() {
	/**
	 * Returns the Manga object of this object
	 *
	 * @return Manga Object
	 */
	val manga: CompletableFuture<Manga> by lazy { retrieve<Manga>("$jikanURL/manga/$malID") }
}