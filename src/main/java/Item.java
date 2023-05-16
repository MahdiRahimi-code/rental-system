import java.util.Date;
import java.util.List;

public class Item {
    protected  String title;
    protected String genre;
    protected String releaseDate;
    protected boolean Available;
    protected int id;


    public Item(String title, String genre, String releaseDate, int id){
        this.id=id;
        this.genre=genre;
        this.title=title;
        this.releaseDate=releaseDate;
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

    public void rentItem1(Customer customer){
        RentalStore rentalStore = new RentalStore();
        rentalStore.rentItem(customer, this);
    }

}
