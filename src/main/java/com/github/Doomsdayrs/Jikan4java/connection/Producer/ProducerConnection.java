package com.github.Doomsdayrs.Jikan4java.connection.Producer;

import com.github.Doomsdayrs.Jikan4java.connection.Connection;
import com.github.Doomsdayrs.Jikan4java.types.Main.Producer.ProducerPage;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

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
 * 04 / November / 2018
 *
 * @author github.com/doomsdayrs
 */
public class ProducerConnection extends Connection {

    /**
     * Constructor
     */
    public ProducerConnection() {
        super();
    }

    /**
     * Retrieves Producer
     *
     * @param ID   ID of magazine
     * @param page page to search for
     * @return Producer object
     * @throws IOException    IOException
     * @throws ParseException ParseException
     */
    public CompletableFuture<ProducerPage> search(int ID, int page) throws IOException, ParseException {
        return retrieve(ProducerPage.class, baseURL + "/producer/" + ID + "/" + page);
    }
}
