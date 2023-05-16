import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalStore {
    private List<Item> items = new ArrayList<Item>();                    //list of available items
    private List<Customer> customers = new ArrayList<Customer>();            //list of registered customers


    public void register(Customer customer){
        customers.add(customer);
    }
    public void addItem(Item item){
        items.add(item);
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
    public Item getItemByID(int itemID) {

        int itemIndex = -1;
        for (int i=0;i<items.size();i++){
            if (items.get(i).getId() == itemID){
                itemIndex = i;
                break;
            }
        }

        if (itemIndex == -1){
            System.out.println("Wrong customer id !!!");
            return null;
        }

        return items.get(itemIndex);
    }

    public void rentItem(Customer customer, Item item){

        int id = item.getId();
        int isFound = 0;
        for (Item i: items) {
            if (i==item){
                isFound = 1;
                break;
            }
        }
        if (isFound == 0){
            System.out.println("Item not in list!!!");
            return ;
        }
        if (item.isAvailable() == false){
            System.out.println("Item is not available");
        }

        String rentID = String.valueOf(item.getId()) + String.valueOf(customer.getId());
        int rentID2 = Integer.parseInt(rentID);
        Rental x = new Rental(item ,customer , rentID2);
        item.setAvailable(false);
        customer.getRentals().add(x);
    }

    public void returnItem(Rental rental){

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
            System.out.println("Item not rented!!!");
            return ;
        }

        rental.getItem().setAvailable(true);
        Date now = new Date();
        rental.setReturnDate(now);
        rental.getCustomer().getRentals().remove(rental);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public List<Item> getAvailableItems(){
        List<Item> availableItems = new ArrayList<Item>();
        for (Item i : items){
            if (i.isAvailable() == true){
                availableItems.add(i);
            }
        }
        return availableItems;
    }

}
