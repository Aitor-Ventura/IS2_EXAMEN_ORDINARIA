package model;

import java.util.Comparator;

public class Movie {//implements Comparable<Movie> {
    private String cover, title, director, actors;
    private int year, duration;
    private double rating;
    private String genre;

    public Movie(String cover, String title, String director, String actors, int year, int duration, double rating, String genre) {
        this.cover = cover;
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.year = year;
        this.duration = duration;
        this.rating = rating;
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
        return actors;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }

    public String getGenres() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "cover='" + cover + '\'' +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }

    // Primer approach a la ordenación de peliculas antes de darme cuenta y hacerlo por funciones lambda, sobra
    public static class GenreSort {
        static final Comparator<Movie> GENRE_SORT = new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getGenres().compareTo(o2.getGenres());
            }
        };
    }
}
