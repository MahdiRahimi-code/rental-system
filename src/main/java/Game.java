public class Game extends Item{
    private String platform;
    private String publisher;

    public Game(String title, String genre, String releaseDate ,int id ,String platform ,String publisher){
        super(title ,genre ,releaseDate ,id);
        this.platform=platform;
        this.publisher=publisher;
    }
    //end of constructor

    public String getPlatform() {
        return platform;
    }
    public String getPublisher() {
        return publisher;
    }
    //end of getters

}