import java.util.Date;
import java.util.List;

public class Movie {
    private  String title;
    private String genre;
    private String releaseDate;
    private boolean Available;
    private int id;
    private List<String> cast;
    private String director;



    public Movie(String title, String genre, String releaseDate, List<String> cast, String director, int id){
        this.id=id;
        this.genre=genre;
        this.title=title;
        this.releaseDate=releaseDate;
        this.cast=cast;
        this.director = director;
        Available=true;

    }
    //end of constuctor

    public void setAvailable(boolean available) {
        this.Available = available;
    }
    //end of setter

    public String getGenre() {
        return genre;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public boolean isAvailable(){
        return Available;
    }
    //end of getters

    public void rentMovie1(Customer customer){
        RentalStore rentalStore = new RentalStore();
        rentalStore.rentMovie(customer, this);
    }
}
