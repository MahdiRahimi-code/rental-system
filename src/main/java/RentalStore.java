import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalStore {
    private List<Movie> Movies = new ArrayList<Movie>();                    //list of available Movies
    private List<Customer> customers = new ArrayList<Customer>();            //list of registered customers


    public void register(Customer customer){
        customers.add(customer);
    }
    public void addMovie(Movie Movie){
        Movies.add(Movie);
    }

    public Customer getCustomerByID(int customerID) {

        int customerIndex = -1;
        for (int i=0;i<customers.size();i++){
            if (customers.get(i).getId() == customerID){
                customerIndex = i;
                break;
            }
        }

        if (customerIndex == -1){
            System.out.println("Wrong customer id !!!");
            return null;
        }

        return customers.get(customerIndex);
    }
    public Movie getMovieByID(int MovieID) {

        int MovieIndex = -1;
        for (int i=0;i<Movies.size();i++){
            if (Movies.get(i).getId() == MovieID){
                MovieIndex = i;
                break;
            }
        }

        if (MovieIndex == -1){
            System.out.println("Wrong movie id !!!");
            return null;
        }

        return Movies.get(MovieIndex);
    }

    public void rentMovie(Customer customer, Movie Movie){

        int id = Movie.getId();
        int isFound = 0;
        for (Movie i: Movies) {
            if (i==Movie){
                isFound = 1;
                break;
            }
        }
        if (isFound == 0){
            System.out.println("Movie not in list!!!");
            return ;
        }
        if (Movie.isAvailable() == false){
            System.out.println("Movie is not available");
        }

        String rentID = String.valueOf(Movie.getId()) + String.valueOf(customer.getId());
        int rentID2 = Integer.parseInt(rentID);
        Rental x = new Rental(Movie ,customer , rentID2);
        Movie.setAvailable(false);
        customer.getRentals().add(x);
    }

    public void returnMovie(Rental rental){

        int isFound = 0;
        Rental x;
        for (Rental i: rental.getCustomer().getRentals()) {
            if (i==rental){
                x=i;
                isFound = 1;
                break;
            }
        }
        if (isFound == 0){
            System.out.println("Movie not rented!!!");
            return ;
        }

        rental.getMovie().setAvailable(true);
        Date now = new Date();
        rental.setReturnDate(now);
        rental.getCustomer().getRentals().remove(rental);
    }

    public void removeMovie(Movie movie){
        Movies.remove(movie);
    }

    public List<Movie> getAvailableMovies(){
        List<Movie> availableMovies = new ArrayList<>();
        for (Movie i : Movies){
            if (i.isAvailable() == true){
                availableMovies.add(i);
            }
        }
        return availableMovies;
    }
}
