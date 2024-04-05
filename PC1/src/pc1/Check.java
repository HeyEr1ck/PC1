package pc1;

public class Check extends Payment {
    private String name;
    private String bankID;
    private boolean authorized;

    public Check(String name, String bankID, boolean authorized) {
        this.name = name;
        this.bankID = bankID;
        this.authorized = authorized;
    }

    @Override
    public float calculateTotalAmount() {
        System.out.println("Estoy pagando con cheque");
        return amount;
    }
    @Override
    public String toString() {
        return "Check{" + "name='" + name + '\'' + ", bankID='" + 
                bankID + '\'' + ", authorized=" + authorized + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

