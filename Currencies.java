import java.util.Scanner;

public class Currencies {
    public static void main(String[] args) {
        System.out.println("USD to EUR\n" +
                    " USD to BAM\n" +
                    " EUR to BAM\n" +
                    " USD to GBP\n" +
                    " EUR to GBP\n" +
                    " USD to AED\n" +
                    " EUR to AED\n" +
                    " USD to JPY\n" +
                    " EUR to JPY\n");

        System.out.println("Choose currencies you would like to convert:");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("usd to eur")){
            USDtoEUR(scanner);
        } else if (choice.equals("eur to bam")){
            EURtoBAM(scanner);
        } else if (choice.equals("eur to bam")) {
            EURtoBAM(scanner);
        } else if (choice.equals("usd to gbp")) {
            USDtoGBP(scanner);
        } else if (choice.equals("eur to gbp")) {
            EURtoGBP(scanner);
        } else if (choice.equals("usd to aed")) {
            USDtoAED(scanner);
        } else if (choice.equals("eur to aed")) {
            EURtoAED(scanner);
        } else if (choice.equals("usd to jpy")) {
            USDtoJPY(scanner);
        } else if (choice.equals("eur to jpy")) {
            EURtoJPY(scanner);
        } else {
            System.out.println("Invalid currency input!");
        }
    }
    private static double USDtoEUR(Scanner scanner){
        System.out.println("Enter amount in USD: ");
        double usd = scanner.nextInt();
        double eur = usd * 0.88;

        System.out.println("EUR: " + eur);
        return eur;
    }

    private static double EURtoBAM(Scanner scanner){
        System.out.println("Enter amount in EUR: ");
        double eur = scanner.nextInt();
        double bam = eur * 1.95583;

        System.out.println("BAM: " + bam);
        return bam;
    }

    private static double USDtoGBP(Scanner scanner){
        System.out.println("Enter amount in USD: ");
        double usd = scanner.nextInt();
        double gbp = usd * 0.74;

        System.out.println("GBP: " + gbp);
        return gbp;
    }

    private static double EURtoGBP(Scanner scanner){
        System.out.println("Enter amount in EUR: ");
        double eur = scanner.nextInt();
        double gbp = eur * 0.84;

        System.out.println("GBP: " + gbp);
        return gbp;
    }

    private static double USDtoAED(Scanner scanner){
        System.out.println("Enter amount in USD: ");
        double usd = scanner.nextInt();
        double aed = usd * 3.67;

        System.out.println("AED: " + aed);
        return aed;
    }

    private static double EURtoAED(Scanner scanner){
        System.out.println("Enter amount in EUR: ");
        double eur = scanner.nextInt();
        double aed = eur * 4.17;

        System.out.println("AED: " + aed);
        return aed;
    }

    private static double USDtoJPY(Scanner scanner){
        System.out.println("Enter amount in USD: ");
        double usd = scanner.nextInt();
        double jpy = usd * 142.63;

        System.out.println("JPY: " + jpy);
        return jpy;
    }

    private static double EURtoJPY(Scanner scanner){
        System.out.println("Enter amount in EUR: ");
        double eur = scanner.nextInt();
        double jpy = eur * 162.05;

        System.out.println("JPY: " + jpy);
        return jpy;
    }
}
