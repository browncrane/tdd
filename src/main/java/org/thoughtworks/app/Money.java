package org.thoughtworks.app;

/**
 * User: crane
 * Date: 13-3-27
 * Time: 上午11:14
 */
public class Money {

    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
