import java.util.Date;

public class Book extends Item{
    private String author;
    private String publisher;

    public Book(String author, String publisher, String title, String genre, String releaseDate, int id){
        super(title ,genre ,releaseDate ,id);
        this.author=author;
        this.publisher=publisher;
    }
    //end of constructor


    public String getPublisher() {
        return publisher;
    }
    public String getAuthor(){
        return author;
    }
    //end of getters

}
