import java.util.ArrayList;

public class Electricity extends Company {
    Double measurement = 200D;
    int limitDebtAmount = 10000;

    public Electricity(String name, int code) {
        this.name = name;
        this.code = code;

    }

    public Electricity(String name, int code, Double measurement) {
        this.name = name;
        this.code = code;
        this.measurement = measurement;
    }


    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public void getDebtorByName(String name, ArrayList<Client> getDebtorByName) {
        for (Client client : getDebtorByName) {
            if (name.equals(client.getName())) {
                System.out.println(client.toString());
            }
        }
    }

    @Override
    public void pay(ArrayList<Client> pay) {
        for (Client client : pay) {
            if (client.getName().equals("Komil")) {
                client.setDeposit(client.getDeposit() + 100000);
                System.out.println("Bajarildi! Balans = " + client.getDeposit());
                break;
            }
        }
    }

    @Override
    public void CalculateByMeasurement(ArrayList<Client> calculateByMeasurement) {
        for (Client client1 : calculateByMeasurement) {
            if (client1.getName().equals("Anvar")) {
                if (client1.getDeposit() > 0) {
                    System.out.println(client1.getName() + " " + client1.getDeposit() / measurement + " kilovat tok olishingiz mumkin.");
                } else {
                    System.out.println("Sizning balansingizda yetarli mablag' mavjud emas! Balans: " + (int) client1.getDeposit() + " so'm.");
                }
            }
        }
    }

    @Override
    public void sendNotificationForDebtor(ArrayList<Client> NotificationForDebtor) {
        double qarz = 0;
        for (Client client1 : NotificationForDebtor) {
            if (client1.getName().equals("Komil")) {
                qarz = client1.getDeposit();
            }
        }
        System.out.println("Hurmatli Komil! Sizning qarzingiz " + (int) qarz*(-1) + " so'm. Iltimos qarzingizni vaqtida to'lang!");
    }
}