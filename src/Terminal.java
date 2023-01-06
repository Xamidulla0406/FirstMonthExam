import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Electricity electricity = new Electricity("Farhod gez", 0001, 700.0);

        Client client1 = new Client("Anvar", "Chilanzor", 65_000d, true, 4, 5);
        Client client2 = new Client("Azam", "Yunusobod", -30000d, true, 2, 3);
        Client client3 = new Client("Komil", "Qoraqamish", -150_000d, false, 2, 4);

        electricity.addClient(client1);
        electricity.addClient(client2);
        electricity.addClient(client3);

                        /** Terminal: */

        Company.getDebtorList(electricity.clients);
        System.out.println();

        Company.getNonActiveClients(electricity.clients);
        System.out.println();

        electricity.pay(electricity.clients);
        System.out.println();

        electricity.sendNotificationForDebtor(electricity.clients);
        System.out.println();

        electricity.CalculateByMeasurement(electricity.clients);
        System.out.println();

    }
}