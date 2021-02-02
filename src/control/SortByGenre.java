package control;

import model.ListMovies;

public class SortByGenre implements Command {
    private ListMovies movies;

    public SortByGenre(ListMovies movies) {
        this.movies = movies;
    }

    @Override
    public void execute() {
        movies.sortByGenre();
    }
}
