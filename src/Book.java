import javax.security.sasl.AuthorizeCallback;

public class Book {
    private String nameBook;
    private Author authorName;
    private int theYearOfPublishing;

    public String getNameBook () {
        return this.nameBook;
    }
    public Author getAuthorName () {
        return this.authorName;
    }

    public int getTheYearOfPublishing() {
        return  this.theYearOfPublishing;
    }

    public void setTheYearOfPublishing() {
        this.theYearOfPublishing = theYearOfPublishing;
    }
}

