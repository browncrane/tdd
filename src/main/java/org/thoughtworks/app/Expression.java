package org.thoughtworks.app;

/**
 * User: crane
 * Date: 13-3-28
 * Time: 下午5:06
 */
public interface Expression {

    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);

    Expression times(int multiplier);
}
