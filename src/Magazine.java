public class Magazine extends Publication{

    private String publisher;

    public Magazine(String publisher, String title, String genre)
    {
        super(title, genre);
        this.publisher = publisher;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    @Override
    public String getInfo()
    {
        return String.format("%s, %s. Published by %s",this.getTitle(),this.getGenre(),this.publisher);
    }
}
