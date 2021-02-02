package control;

import model.ListMovies;

public class SortByNew implements Command {
    private ListMovies movies;

    public SortByNew(ListMovies movies) {
        this.movies = movies;
    }

    @Override
    public void execute() {
        movies.sortByNew();
    }
}
