import javax.security.sasl.AuthorizeCallback;

public class Book {
    String nameBook;
    Author authorName;
    int theYearOfPublishing;
public  Book(String nameBook, Author authorName, int theYearOfPublishing) {
    this.nameBook = nameBook;
    this.authorName = authorName;
    this.theYearOfPublishing = theYearOfPublishing;
}
}

