package com.dev.cinema.dao.interfaces;

import com.dev.cinema.model.Movie;
import java.util.List;

public interface MovieDao {

    Movie add(Movie movie);

    List<Movie> getALl();
}
