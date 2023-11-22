package com.dev.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepo movieRepo;
	
	public List<Movie> allMovies(){
		return movieRepo.findAll();
	}
	
	public Optional<Movie> getMovie(String imdbId) {
		return movieRepo.findMovieByImdbId(imdbId);
	}
	
}
