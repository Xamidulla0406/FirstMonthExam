import java.util.Scanner;

public class Interface {
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
        boolean davomiylik = true;
        int command;
        while (davomiylik){
             System.out.println("""
                     1) print qarzdorlar ro'yhati
                     2) print active bo'lmagan mijozlar ro'yhati
                     3) Komil 100000 som toladi
                     4) send notification to Komil his debt
                     5) print calculateByMeasurement for anvar""");

             System.out.print("Buyruqni kiriting: ");
            command = in.nextInt();

            switch (command) {
                case 1 -> Company.getDebtorList(electricity.clients);
                case 2 -> Company.getNonActiveClients(electricity.clients);
                case 3 -> electricity.pay(electricity.clients);
                case 4 -> electricity.sendNotificationForDebtor(electricity.clients);
                case 5 -> electricity.CalculateByMeasurement(electricity.clients);
                default -> System.out.println("Buyruq noto'g'ri kiritildi, qaytadan urib ko'ring...");
            }
            System.out.print("Davom etasizmi? [yes[1]/no[0]] ");
            int check = in.nextInt();
            if(check == 0){ davomiylik = false;}
        }
    }
}