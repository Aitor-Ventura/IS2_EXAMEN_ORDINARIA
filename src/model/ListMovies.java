package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMovies {
    private ArrayList<Movie> movies;

    public ListMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public ListMovies() {
        movies = new ArrayList<>();
    }

    public void add(Movie movie){
        movies.add(movie);
    }

    // A través de funciones lambda, ordenamos por género alfabeticamente
    public void sortByGenre(){
        //Collections.sort(movies, Movie.GenreSort.GENRE_SORT);
        Collections.sort(movies, Comparator.comparing(Movie::getGenres));
    }

    // A través de funciones lambda, ordenamos por vistas
    public void sortByViews(){
        //Collections.sort(movies, Comparator.comparing())
        Collections.sort(movies, Comparator.comparing(Movie::getRating));
    }

    // A través de funciones lambda, ordenamos por año (cuanto mayor el año, más nuevo)
    public void sortByNew(){
        Collections.sort(movies, Comparator.comparing(Movie::getYear).reversed());
    }

    // A través de funciones lambda, ordenamos por rating
    public void sortByRating(){
        Collections.sort(movies, Comparator.comparing(Movie::getRating));
    }

    @Override
    public String toString() {
        return movies.toString().replaceAll("}", "}\n");
    }
}
