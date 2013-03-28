package org.thoughtworks.app;

/**
 * User: crane
 * Date: 13-3-27
 * Time: 上午11:14
 */
public abstract class Money {

    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    abstract Money times(int multiplier);

    static Money franc(int amount) {
        return new Franc(amount);
    }
}
