package com.github.Doomsdayrs.Jikan4java.connection;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * This file is part of Jikan4java.
 * Jikan4java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with Jikan4java.  If not, see <https://www.gnu.org/licenses/>.
 * ====================================================================
 * Jikan4java
 * 03 / May / 2019
 *
 * @author github.com/doomsdayrs
 */
public class Connection extends Retriever {

    public Connection() {
        super();
    }

    public Connection(ObjectMapper objectMapper) {
        super(objectMapper);
    }

    public Object search(String string) throws IOException, ParseException {
        return null;
    }

    public Object searchPage(String title, int page) throws IOException, ParseException {
        return null;
    }

}