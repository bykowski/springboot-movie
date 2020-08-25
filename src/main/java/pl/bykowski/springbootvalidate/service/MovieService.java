package pl.bykowski.springbootvalidate.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pl.bykowski.springbootvalidate.exception.IdNotFoundException;
import pl.bykowski.springbootvalidate.model.Movie;

@Service
public class MovieService {

  private List<Movie> movieList;

  public MovieService() {
    this.movieList = new ArrayList<>();
  }

  public String callError() {
    throw new IdNotFoundException("Error");
  }

  public List<Movie> getAll() {
    return movieList;
  }

  public boolean addMovie(Movie movie) {
    return movieList.add(movie);
  }

  public Movie getByName(String name) {
    return movieList
        .stream()
        .filter(element -> element.getName().equals(name))
        .findFirst()
        .orElseThrow(() -> new IdNotFoundException("Movie with provided name not exist"));
  }
}
