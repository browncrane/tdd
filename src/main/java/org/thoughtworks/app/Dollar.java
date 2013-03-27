package org.thoughtworks.app;

/**
 * User: crane
 * Date: 13-3-26
 * Time: 下午5:00
 */
public class Dollar extends Money{

    public Dollar(int amount) {
        super(amount);
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
