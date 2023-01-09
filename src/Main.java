public class Main {
    public static void main(String[] args) {

        Author janeAusten = new Author("Jane", "Austen");
        System.out.println("janeAusten.authorName = " + janeAusten.authorName);
        System.out.println("janeAusten.authorSurname = " + janeAusten.authorSurname);

        Author karenPryor = new Author("Karen", "Pryor");
        System.out.println("karenPryor.authorName = " + karenPryor.authorName);
        System.out.println("karenPryor.authorSurname = " + karenPryor.authorSurname);
    }

    public static void main(String[] args) {
        Book senseAndSensibility = new Book("Sense and Sensibility", "Jane Austen", 2016);
        System.out.println("senseAndSensibility.nameBook = " + senseAndSensibility.nameBook);
        System.out.println("senseAndSensibility.authorName = " + senseAndSensibility.authorName);
        System.out.println("senseAndSensibility.theYearOfPublishing = " + senseAndSensibility.theYearOfPublishing);

        Book dontGrowlAtTheDog = new Book("dontGrowlAtTheDog", "Karen""Pryor", 2022);
        System.out.println("dontGrowlAtTheDog.nameBook = " + dontGrowlAtTheDog.nameBook);
        System.out.println("dontGrowlAtTheDog.authorName = " + dontGrowlAtTheDog.authorName);
        System.out.println("dontGrowlAtTheDog.theYearOfPublishing = " + dontGrowlAtTheDog.theYearOfPublishing);
    }
}
