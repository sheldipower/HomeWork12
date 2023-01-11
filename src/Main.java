public  class Main {

    public static void main(String [] args) {
        Author author1 = new Author("Jane", "Austin");
        Author author2 = new Author("Karen", "Pryor");
        Book book1 = new Book("feeling and sensitivity", author1, 2016);
        Book book2 = new Book("don't growl at the dog", author2, 2022);
        System.out.println("book 1 = " + book1.bookName + author1 +  book1.publishingYear );
        System.out.println("book2 = " + book2.bookName + author2 + book2.publishingYear);
    }
}