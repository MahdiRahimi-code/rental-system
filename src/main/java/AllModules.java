import java.util.ArrayList;

public class AllModules {
    private ArrayList<Game> games;
    private ArrayList<Movie> movies;
    private ArrayList<Book> books;
    private ArrayList<Customer> customers;

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Game> getGames() {
        return games;
    }
    public ArrayList<Movie> getMovies() {
        return movies;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
