package bg.trifonov.movies.service;

import bg.trifonov.movies.domain.Movie;
import bg.trifonov.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> allMovies() {
        return this.movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId) {
        return this.movieRepository.getMovieByImdbId(imdbId);
    }
}
