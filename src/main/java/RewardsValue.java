package src.main.java;

public class RewardsValue {
    private double cashValue;
    private int milesValue;

    public RewardsValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    public RewardsValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double convertFromMilesToCash(int milesValue) {
        return milesValue * 0.0035;
    }
}

