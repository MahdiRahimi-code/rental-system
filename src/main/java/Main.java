import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
public static void main(String[]args) throws IOException {
        Gson gson = new Gson();
        Reader reader = new FileReader("C:\\Users\\AceR\\Desktop\\Java\\new_Movie_Rental_System\\TestYourFork.json");
        AllModules allModulesList = gson.fromJson(reader, new TypeToken<AllModules>() {
        }.getType());

        Customer John = allModulesList.getCustomers().get(0);
        Customer Emily = allModulesList.getCustomers().get(1);
        Customer Michael = allModulesList.getCustomers().get(2);

        for (Item temp : allModulesList.getBooks()){
                if (temp.getId()==3){
                        RentalStore r = new RentalStore();
                        r.rentItem(John, temp);
                }
                if (temp.getId()==6){
                        RentalStore r = new RentalStore();
                        r.rentItem(John, temp);
                }
        }
        for (Item temp : allModulesList.getBooks()){
                if (temp.getId()==1){
                        RentalStore r = new RentalStore();
                        r.rentItem(Emily, temp);
                }
                if (temp.getId()==7){
                        RentalStore r = new RentalStore();
                        r.rentItem(Emily, temp);
                }
        }
        for (Item temp : allModulesList.getBooks()){
                if (temp.getId()==9){
                        RentalStore r = new RentalStore();
                        r.rentItem(Michael, temp);
                }
                if (temp.getId()==4){
                        RentalStore r = new RentalStore();
                        r.rentItem(Michael, temp);
                }
        }

        reader.close();
        }
}
