import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;

public class Main {
public static void main(String[]args) throws IOException {
        Gson gson = new Gson();
        Reader reader = new FileReader("C:\\Users\\AceR\\Desktop\\Java\\new_Movie_Rental_System\\TestYourFork.json");
        AllModules allModulesList = gson.fromJson(reader, new TypeToken<AllModules>() {
        }.getType());
        reader.close();

        Customer John = allModulesList.getCustomers().get(0);
        Customer Emily = allModulesList.getCustomers().get(1);
        Customer Michael = allModulesList.getCustomers().get(2);

        RentalStore book = new RentalStore();

        book.register(John);
        book.register(Emily);
        book.register(Michael);

        Book b1 = allModulesList.getBooks().get(2);
        book.addItem(b1);
        book.rentItem(John, b1);

        Book b2 = allModulesList.getBooks().get(5);
        book.addItem(b2);
        book.rentItem(John, b2);

        Book b3 = allModulesList.getBooks().get(0);
        book.addItem(b3);
        book.rentItem(Emily, b3);

        Book b4 = allModulesList.getBooks().get(6);
        book.addItem(b4);
        book.rentItem(Emily , b4);

        Book b5 = allModulesList.getBooks().get(8);
        book.addItem(b5);
        book.rentItem(Michael, b5);

        RentalStore game = new RentalStore();

        Game g1 = allModulesList.getGames().get(3);
        game.addItem(g1);
        game.rentItem(Michael, g1);


        Gson toWrite = new Gson();
        String json = toWrite.toJson(allModulesList);
        String pa = "C:\\Users\\AceR\\Desktop\\Java\\new_Movie_Rental_System\\TestYourFork.json";
        try{
                FileWriter writer = new FileWriter(pa);
                writer.write(json);
                writer.close();
        } catch (IOException e) {
                throw new RuntimeException(e);
        }


}
}
