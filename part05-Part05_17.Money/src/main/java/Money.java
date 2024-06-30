
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newMoneyEuros = addition.euros() + this.euros();
        int newMoneyCents = addition.cents() + this.cents();

        Money newMoney = new Money(newMoneyEuros, newMoneyCents);
        return newMoney;

    }

    public boolean lessThan(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;

        } else if (this.euros() == compared.euros()){
            if (this.cents() < compared.cents()) {
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int newMoneyEuros = this.euros() - decreaser.euros();
        int newMoneyCents = this.cents() - decreaser.cents(); 
        
        if (this.lessThan(decreaser)) {
            newMoneyEuros = 0;
            newMoneyCents = 0;
        }
        
        else if (newMoneyCents < 0) {
            newMoneyCents = 100 + newMoneyCents;
            newMoneyEuros -= 1;
        }
        
        Money newMoney = new Money(newMoneyEuros, newMoneyCents);
        return newMoney;
    }

}
