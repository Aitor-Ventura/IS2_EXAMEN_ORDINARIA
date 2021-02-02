package control;

import model.ListMovies;

public class SortByViews implements Command {
    private ListMovies movies;

    public SortByViews(ListMovies movies) {
        this.movies = movies;
    }

    @Override
    public void execute() {
        movies.sortByViews();
    }
}
