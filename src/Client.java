public class Client {
    private String name;
    private String adress;
    private double deposit;
    private boolean isActive;
    private int startedData;
    private int lastPaidData;

    public Client(String name, String adress, double deposit, boolean isActive, int startedData, int lastPaidData) {
        this.name = name;
        this.adress = adress;
        this.deposit = deposit;
        this.isActive = isActive;
        this.startedData = startedData;
        this.lastPaidData = lastPaidData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setAcitive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getStartedData() {
        return startedData;
    }

    public void setStartedData(int startedData) {
        this.startedData = startedData;
    }

    public int getLastPaidData() {
        return lastPaidData;
    }

    public void setLastPaidData(int lastPaidData) {
        this.lastPaidData = lastPaidData;
    }

    @Override
    public String toString() {
        return  "| Name: '" + name + '\'' +
                "| Adress: '" + adress + '\'' +
                "| Deposit: " + deposit +
                "| IsActive: " + isActive +
                "| StartedData: " + startedData +
                "| LastPaidData: " + lastPaidData + " |";
    }
}