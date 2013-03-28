package org.thoughtworks.app;

/**
 * User: crane
 * Date: 13-3-27
 * Time: 上午11:14
 */
public class Money implements Expression{

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount){
        return new Money(amount,"USD");
    }

    static Money franc(int amount){
        return new Money(amount,"CHF");
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    String currency() {
        return currency;
    }

    public String toString() {
        return amount + " " + currency;
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public Expression plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }
}
