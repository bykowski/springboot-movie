package pl.bykowski.springbootvalidate.controller;

import java.util.List;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.bykowski.springbootvalidate.model.Movie;
import pl.bykowski.springbootvalidate.service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getMovies(){
        return movieService.getAll();
    }

    @GetMapping("/{name}")
    public Movie getOne(@PathVariable String name){
        return movieService.getByName(name);
    }

    @GetMapping("/hello")
    public String getMoviesHello(){
        return movieService.callError();
    }

    @PostMapping
    public boolean addMovie(@Validated @RequestBody Movie movie){
        return movieService.addMovie(movie);
    }
}
