package com.dev.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/v1/movies")
public class Controller {

	@Autowired
	private MovieService movieService;
	
//	@GetMapping
//	public ResponseEntity<String> check() {
//		return new ResponseEntity<String>("All Movies!",HttpStatus.OK);
//	}

	
	//@GetMapping(value="/allMovies")
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping
	public ResponseEntity<List<Movie>> allMovies() {
		System.out.println(movieService.allMovies());
		return new ResponseEntity<List<Movie>>(movieService.allMovies(),HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/{imdbId}")
	public ResponseEntity<Optional<Movie>> getMovie(@PathVariable String imdbId){
		System.out.println(movieService.allMovies());
		return new ResponseEntity<Optional<Movie>>(movieService.getMovie(imdbId),HttpStatus.OK);
	}
}
