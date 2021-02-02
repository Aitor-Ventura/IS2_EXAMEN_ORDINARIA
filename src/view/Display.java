package view;

import model.ListMovies;

public interface Display extends ListMovies.Observer {
    public void display(ListMovies listMovies);
}
