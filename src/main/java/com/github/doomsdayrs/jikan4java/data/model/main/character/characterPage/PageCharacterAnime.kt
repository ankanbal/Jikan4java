package com.github.doomsdayrs.jikan4java.data.model.main.character.characterPage

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import com.github.doomsdayrs.jikan4java.common.jikanURL
import com.github.doomsdayrs.jikan4java.core.Retriever
import com.github.doomsdayrs.jikan4java.data.base.MyAnimeListID
import com.github.doomsdayrs.jikan4java.data.base.MyAnimeListName
import com.github.doomsdayrs.jikan4java.data.base.MyAnimeListType
import com.github.doomsdayrs.jikan4java.data.base.MyAnimeListURL
import com.github.doomsdayrs.jikan4java.data.model.main.anime.Anime
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
 * 04 / November / 2018
 *
 * @author github.com/doomsdayrs
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
data class PageCharacterAnime(
		@field:JsonProperty("mal_id") override val malID: Int = 0,
		@field:JsonProperty("type") override val type: String? = null,
		@field:JsonProperty("name") override val name: String,
		@field:JsonProperty("url") override val url: String
) : Retriever(), MyAnimeListID, MyAnimeListURL, MyAnimeListName , MyAnimeListType {

	/**
	 * Returns the Anime object of this object
	 *
	 * @return Anime Object
	 */
	val anime: CompletableFuture<Anime> by lazy { retrieve<Anime>("$jikanURL/anime/$malID") }
}