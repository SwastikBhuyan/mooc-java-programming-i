
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {

        double change = 0;
        if (payment >= 2.50) {
            this.money += payment;
            change = (payment - 2.50);
            this.money -= change;
            this.affordableMeals += 1;
        } else if (payment > 0) {
            change += payment;
        }
        return change;
    }

    public double eatHeartily(double payment) {

        double change = 0;
        if (payment >= 4.30) {
            this.money += payment;
            change = (payment - 4.30);
            this.money -= change;
            this.heartyMeals += 1;
        } else if (payment > 0) {
            change += payment;
        }
        return change;
    }

    public boolean eatAffordably(PaymentCard card) {

        double balance = card.balance();
        if (balance >= 2.50) {
            balance -= 2.50;
            card.setBalance(Math.round(balance * 100.00) / 100.00);
            this.affordableMeals += 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {

        double balance = card.balance();
        if (balance >= 4.30) {
            balance -= 4.30;
            card.setBalance(Math.round(balance * 100.00) / 100.00);
            this.heartyMeals += 1;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        double balance = card.balance();
        if (sum > 0) {
            this.money += sum;
            balance += sum;
            card.setBalance(Math.round(balance * 100.00) / 100.00);
        }

    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
