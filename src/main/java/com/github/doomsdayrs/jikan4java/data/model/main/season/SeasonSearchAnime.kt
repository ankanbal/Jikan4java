package com.github.doomsdayrs.jikan4java.data.model.main.season

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.doomsdayrs.jikan4java.common.jikanURL
import com.github.doomsdayrs.jikan4java.core.Retriever
import com.github.doomsdayrs.jikan4java.data.base.*
import com.github.doomsdayrs.jikan4java.data.model.main.anime.Anime
import com.github.doomsdayrs.jikan4java.data.model.support.basic.meta.Genre
import com.github.doomsdayrs.jikan4java.data.model.support.basic.meta.Producer
import java.util.*
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
 * ====================================================================
 * Jikan4java
 * 31 / October / 2018
 *
 * @author github.com/doomsdayrs
 */
data class SeasonSearchAnime(
		@field:JsonProperty("mal_id") override val malID: Int = 0,
		@field:JsonProperty("url") val url: String = "",
		@field:JsonProperty("title") override val title: String,
		@field:JsonProperty("image_url") override val imageURL: String = "",
		@field:JsonProperty("synopsis") val synopsis: String = "",
		@field:JsonProperty("type") override val type: String = "",
		@field:JsonProperty("airing_start") val airing_start: String = "",
		@field:JsonProperty("episodes") override val episodeCount: Int = 0,
		@field:JsonProperty("members") val members: Int = 0,
		@field:JsonProperty("genres") override val genres: List<Genre>,
		@field:JsonProperty("source") override val source: String = "",
		@field:JsonProperty("producers") val producers: List<Producer>,
		@field:JsonProperty("score") override val score: Double,
		@field:JsonProperty("licensors") val licensors: List<String>,
		@field:JsonProperty("r18") val r18: Boolean = false,
		@field:JsonProperty("kids") val kids: Boolean = false,
		@field:JsonProperty("continuing") val continuing: Boolean = false
) :
		Retriever(),
		MyAnimeListID,
		MyAnimeListTitle,
		MyAnimeListImageURL,
		MyAnimeListType,
		MyAnimeListSource, MyAnimeListEpisodeCount, MyAnimeListScore, MyAnimeListGenres {

	/**
	 * Returns the Anime object of this object
	 *
	 * @return Anime Object
	 */
	val anime: CompletableFuture<Anime> by lazy { retrieve<Anime>("$jikanURL/anime/$malID") }
}