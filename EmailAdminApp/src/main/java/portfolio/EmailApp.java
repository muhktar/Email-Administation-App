package portfolio;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John","Smith");
        System.out.println(em1.showInfo());

        Email em2 = new Email("Kelly", "Richards");
        System.out.println(em2.showInfo());

        Email em3 = new Email("Mark", "Duncan");
        System.out.println(em3.showInfo());
    }

}

