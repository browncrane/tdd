package org.thoughtworks.app;

/**
 * User: crane
 * Date: 13-3-26
 * Time: 下午5:00
 */
public class Franc extends Money{

    private String currency;

    public Franc(int amount, String currency) {
        super(amount,currency);
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
