package view;

import model.ListMovies;

public class MockDisplay implements Display {
    ListMovies listMovies;

    @Override
    public void display(ListMovies listMovies) {
        this.listMovies = listMovies;
        System.out.println(listMovies.toString());
    }

    @Override
    public void update(ListMovies listMovies) {
        this.listMovies = listMovies;
    }
}
