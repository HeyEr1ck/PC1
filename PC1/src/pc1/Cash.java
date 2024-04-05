package pc1;

public class Cash extends Payment {
    private double cashAmount;
    private double deduction;

    public Cash(double cashAmount, double deduction) {
        this.cashAmount = cashAmount;
        this.deduction = deduction;
    }

    @Override
    public float calculateTotalAmount() {
        System.out.println("Estoy pagando con efectivo");
        return (float) (cashAmount - deduction);
    }

    @Override
    public String toString() {
        return "Cash{" + "cashAmount=" + cashAmount + ", deduction=" + 
                deduction + '}';
    }

    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }   
}

