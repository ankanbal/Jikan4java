package com.github.doomsdayrs.jikan4java.data.model.main.top.base

import com.github.doomsdayrs.jikan4java.data.base.MyAnimeListScore
import com.github.doomsdayrs.jikan4java.data.base.MyAnimeListType

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
 */ /**
 * Jikan4java
 * 18 / 11 / 2019
 *
 * @author github.com/doomsdayrs
 */
abstract class TopListingMedia : TopListing(), MyAnimeListType, MyAnimeListScore {
	abstract val members: Int
	abstract val startDate: String
	abstract val endDate: String
}