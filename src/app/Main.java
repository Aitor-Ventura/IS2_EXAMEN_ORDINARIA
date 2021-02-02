package app;

import control.*;
import model.ListMovies;
import model.Movie;
import view.Display;
import view.MockDisplay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private Display display;
    //private Command command;

    public static void main(String[] args) {
        new Main().execute();
    }

    public Main(){
    }

    public void execute(){
        this.display = new MockDisplay();
        ArrayList<ListMovies.Observer> observers = new ArrayList<>();
        ListMovies movies = new ListMovies(observers);
        Movie movie1 = new Movie("Imagen1", "Examen de IS2", "JJ", "Alumnos", 2021, 180, 3.0, "Thriller");
        Movie movie2 = new Movie("Imagen2", "Americanos", "PP", "Profes", 2019, 120, 5.0, "Accion");
        Movie movie3 = new Movie("Imagen3", "Programacion especial", "ULPGC", "ULPGC Staff",
                1998, 5000, 8.3, "Horror");
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        Map<String, Command> commands = new HashMap<>();
        commands.put("Genero", new SortByGenre(movies));
        commands.put("Nuevo", new SortByNew(movies));
        commands.put("Vistas", new SortByViews(movies));
        commands.put("Rating", new SortByRating(movies));

        commands.get("Nuevo").execute();
        this.display.display(movies);
    }
}
