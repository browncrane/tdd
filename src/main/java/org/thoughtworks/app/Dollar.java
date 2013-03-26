package org.thoughtworks.app;

/**
 * User: crane
 * Date: 13-3-26
 * Time: 下午5:00
 */
public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        amount *= multiplier;
    }
}
