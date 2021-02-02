package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListMovies {
    private ArrayList<Movie> movies;
    private ArrayList<Observer> observers;

    public ListMovies(ArrayList<Observer> observers, ArrayList<Movie> movies) {
        this.movies = movies;
        this.observers = observers;
    }

    public ListMovies(ArrayList<Observer> observers) {
        movies = new ArrayList<>();
        this.observers = observers;
    }

    public void add(Movie movie){
        movies.add(movie);
        notificar();
    }

    // A través de funciones lambda, ordenamos por género alfabeticamente
    public void sortByGenre(){
        //Collections.sort(movies, Movie.GenreSort.GENRE_SORT);
        Collections.sort(movies, Comparator.comparing(Movie::getGenres));
        notificar();
    }

    // A través de funciones lambda, ordenamos por vistas

    /**
     * Añadí esta función pero no tengo muy bien entendido como hay que implementarlo. En mi juicio, cada vez que se
     * "clickee" en una película, su vista aumentará, por tanto habrá que tener un número específico de vistas
     * respectiva a cada película. Por eso añadí los observadores, para que de alguna manera se pueda registrar que se
     * ha elegido esa película en cuestión. Sin embargo, no se me ocurre como implementarlo.
     *
     * Una manera que se me ocurre es como he hecho con los otros campos; inventarme yo un número cualquiera de visualizaciones,
     * pasárselo por el constructor y que ordene esto de la misma manera que los otros. Pero muy dinámico al sentido que yo
     * le encuentro al enunciado no es.
      */
    public void sortByViews(){
        //Collections.sort(movies, Comparator.comparing())
        Collections.sort(movies, Comparator.comparing(Movie::getRating));
        notificar();
    }

    // A través de funciones lambda, ordenamos por año (cuanto mayor el año, más nuevo)
    public void sortByNew(){
        Collections.sort(movies, Comparator.comparing(Movie::getYear).reversed());
        notificar();
    }

    // A través de funciones lambda, ordenamos por rating (cuanto mayor el rating, mejor)
    public void sortByRating(){
        Collections.sort(movies, Comparator.comparing(Movie::getRating).reversed());
        notificar();
    }

    @Override
    public String toString() {
        return movies.toString().replaceAll("}", "}\n");
    }

    public interface Observer {
        public void update(ListMovies listMovies);
    }

    private void notificar(){
        for (Observer observer : observers){
            observer.update(this);
        }
    }
}
