package view;

import model.ListMovies;

public class MockDisplay implements Display {
    ListMovies listMovies;

    // Añadir objeto
    @Override
    public void display(ListMovies listMovies) {
        this.listMovies = listMovies;
        System.out.println(listMovies.toString());
    }
    // posible añadir update tb
}
