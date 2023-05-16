import java.util.ArrayList;
import java.util.List;

public class Movie extends Item{
    private List<String> cast = new ArrayList<String>();
    private String director;

    public Movie(String title, String genre, String director, List<String> cast, String realeaseDate, int id){
        super(title ,genre ,realeaseDate ,id);
        this.director=director;
        this.cast=cast;
    }        //end of constructor

    public String getDirector() {
        return director;
    }
    public List<String> getCast() {
        return cast;
    }
    //end of getters


}
