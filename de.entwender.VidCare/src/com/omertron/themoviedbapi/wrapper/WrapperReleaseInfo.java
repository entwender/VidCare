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
package com.omertron.themoviedbapi.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.omertron.themoviedbapi.model.ReleaseInfo;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Stuart
 */
public class WrapperReleaseInfo extends AbstractWrapperId implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonProperty("countries")
    private List<ReleaseInfo> countries;

    public List<ReleaseInfo> getCountries() {
        return countries;
    }

    public void setCountries(List<ReleaseInfo> countries) {
        this.countries = countries;
    }
}
