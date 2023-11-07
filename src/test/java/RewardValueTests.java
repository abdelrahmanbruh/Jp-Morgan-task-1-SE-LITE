package src.test.java;

import org.junit.jupiter.api.Test;
import src.main.java.RewardsValue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardsValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardsValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        Double cashValue = 500.0;
        var rewardsValue = new RewardsValue(cashValue);
        assertEquals(142857, rewardsValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 142857;
        var rewardsValue = new RewardsValue(milesValue);
        assertEquals(499.9995, rewardsValue.getCashValue());
    }
}
