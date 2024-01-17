package rvt;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money addition) {
        Money newMoney = new Money(euros+addition.euros,cents+addition.cents); // create a new Money object that has the correct worth
        if (newMoney.cents >= 100) {
            newMoney = new Money(newMoney.euros+1, newMoney.cents-100);
        }
        // return the new Money object
        return newMoney;
    }
    public boolean lessThan(Money compared){
        if (euros < compared.euros) {
            return true;
        }
        else{
            return false;
        }
    }
    public Money minus(Money decreaser){
        int euro1 = euros-decreaser.euros;
        int cents1 = cents-decreaser.cents;
        if (cents1 < 0){
            euro1--;
            cents1 = 100 + cents1;
        }
        Money newMoney = new Money(euro1, cents1); // create a new Money object that has the correct worth
        if (euro1 < 0) {
            newMoney = new Money(0,0);
        }
        // return the new Money object
        return new Money(newMoney.euros, newMoney.cents);
    }
}