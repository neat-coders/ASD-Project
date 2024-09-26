

package app.banking.strategies;

import app.framework.entity.PercentageStrategy;

public class SavingPercentageStrategy implements PercentageStrategy {

    private double percent = .1;

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double getPercentAmount(double amount) {
        return amount * percent;
    }

    public String getName() {
        return "SAVING";
    }
}
