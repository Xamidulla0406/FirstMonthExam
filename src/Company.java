import java.util.ArrayList;

public abstract class Company {
    String name;
    int code;
    ArrayList<Client> clients = new ArrayList<>();
    int currentDate;

    public abstract void addClient(Client client);
    public abstract void getDebtorByName(String name, ArrayList<Client> getDebtorByName);
    public abstract void pay(ArrayList<Client> Pay);
    public abstract void CalculateByMeasurement(ArrayList<Client> calculateByMeasurement);
    public abstract void sendNotificationForDebtor(ArrayList<Client> NotificationForDebtor);

    public static void getDebtorList(ArrayList<Client> debtors){
        System.out.println("Qarzdorlar:");
        for (Client client: debtors) {
            if(client.getDeposit() < 0){
                System.out.println(client.toString());
            }
        }
    }
    public static void getNonActiveClients(ArrayList<Client> NonActiveClient){
        System.out.println("Aktiv bo'lmagan foydalanuvchilar:");
        for (Client client : NonActiveClient) {
            if(!client.isActive()){
                System.out.println(client.toString());
            }
        }
    }

    public static void getActiveClients(ArrayList<Client> ActiveClient) {
        System.out.println("Aktiv foydalanuvchilar:");
        for (Client client : ActiveClient) {
            if(client.isActive()){
                System.out.println(client.toString());
            }
        }
    }
}