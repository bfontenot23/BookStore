public class Publication implements Comparable<Publication>{

    private String genre;
    private String title;

    public Publication(String title, String genre)
    {
        this.genre = genre;
        this.title = title;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getInfo()
    {
        return String.format("%s, %s.",this.title,this.genre);
    }

    @Override
    public int compareTo(Publication o) {
        if(this.genre.compareTo(o.getGenre())==0) return this.title.compareTo(o.getTitle());
        else return this.genre.compareTo(o.getGenre());
    }
}
