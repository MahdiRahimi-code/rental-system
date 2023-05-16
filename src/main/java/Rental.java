import java.util.Date;


public class Rental {
    private int id;
    private Item item;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate;

    public Item getItem() {
        return item;
    }

    public Rental(Item item, Customer customer, int id){
        this.customer=customer;
        this.id=id;
        item.setAvailable(true);
        Date now = new Date();
        rentalDate = now;
        this.item=item;

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