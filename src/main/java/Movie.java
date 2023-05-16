import java.util.ArrayList;
import java.util.List;

public class Movie extends Item{
    private String cast;
    private String director;

    public Movie(String title, String genre, String director, String cast, String releaseDate, int id){
        super(title ,genre ,releaseDate ,id);
        this.director=director;
        this.cast=cast;
    }        //end of constructor

    public String getDirector() {
        return director;
    }
    public String getCast() {
        return cast;
    }
    //end of getters


}
