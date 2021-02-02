package control;

import model.ListMovies;

public class SortByRating implements Command {
    private ListMovies movies;

    public SortByRating(ListMovies movies) {
        this.movies = movies;
    }

    @Override
    public void execute() {
        movies.sortByRating();
    }
}
