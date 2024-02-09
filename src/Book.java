public class Book extends Publication{

    private String author;

    public Book(String author, String title, String genre)
    {
        super(title, genre);
        this.author = author;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    @Override
    public String getInfo()
    {
        return String.format("%s, %s. Written by %s",this.getTitle(),this.getGenre(),this.author);
    }
}
