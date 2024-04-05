package pc1;

import java.util.Date;

public class Credit_card extends Payment {
    private String name;
    private String type;
    private Date expDate;
    private boolean authorized;

    public Credit_card(String name, String type, Date expDate, boolean authorized) {
        this.name = name;
        this.type = type;
        this.expDate = expDate;
        this.authorized = authorized;
    }

    @Override
    public float calculateTotalAmount() {
        System.out.println("Estoy pagando con tarjeta de crédito");
        return amount;
    }


    @Override
    public String toString() {
        return "CreditCard{" + "name='" + name + '\'' + ", type='" + type + '\'' +
                ", expDate=" + expDate + ", authorized=" + authorized + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
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
