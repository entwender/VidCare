/*
 *      Copyright (c) 2004-2014 Stuart Boston
 *
 *      This file is part of TheMovieDB API.
 *
 *      TheMovieDB API is free software: you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation, either version 3 of the License, or
 *      any later version.
 *
 *      TheMovieDB API is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *
 *      You should have received a copy of the GNU General Public License
 *      along with TheMovieDB API.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.omertron.themoviedbapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChangedMovie extends AbstractJsonMapping {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;
    @JsonProperty("adult")
    private boolean adult;

    public String getId() {
        return id;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }
}
