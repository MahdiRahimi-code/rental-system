import java.util.Date;


public class Rental {
    private int id;
    private Movie Movie;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate;

    public Movie getMovie() {
        return Movie;
    }

    public Rental(Movie Movie, Customer customer, int id){
        this.customer=customer;
        this.id=id;
        Movie.setAvailable(true);
        Date now = new Date();
        rentalDate = now;
        this.Movie=Movie;

        rentalDate = new Date();
    }   //end of constructor


    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Date getRentalDate() {
        return rentalDate;
    }
    public Date getReturnDate() {
        return returnDate;
    }
    //end of getters

    public void setReturnDate(Date date) {
        returnDate = date;
    }
    //end of setters

}