
    public class Book {
        String nameBook;
        Author authorName;
        int theYearOfPublishing;

        public Book (String nameBook, Author authorName, int theYearOfPublishing) {
            this.nameBook = nameBook;
            this.authorName = authorName;
            this.theYearOfPublishing = theYearOfPublishing;
        }
    }
    public class Main {
        public static void main (String[] args) {
            Book senseAndSensibility = new Book("Sense and Sensibility", "Jane Austen", 2016);
            System.out.println("senseAndSensibility.nameBook = " + senseAndSensibility.nameBook);
            System.out.println("senseAndSensibility.authorName = " + senseAndSensibility.authorName);
            System.out.println("senseAndSensibility.theYearOfPublishing = " + senseAndSensibility.theYearOfPublishing);

            Book dontGrowlAtTheDog = new Book("dontGrowlAtTheDog", "Karen Pryor", "2022");
            System.out.println("dontGrowlAtTheDog.nameBook = " + dontGrowlAtTheDog.nameBook);
            System.out.println("dontGrowlAtTheDog.authorName = " + dontGrowlAtTheDog.authorName);
            System.out.println("dontGrowlAtTheDog.theYearOfPublishing = " + dontGrowlAtTheDog.theYearOfPublishing);
        }
}