package org.thoughtworks.app;

/**
 * User: crane
 * Date: 13-3-26
 * Time: 下午5:00
 */
public class Franc extends Money{
    public Franc(int amount) {
        super(amount);
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
