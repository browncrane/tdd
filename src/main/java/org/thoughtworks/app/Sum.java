package org.thoughtworks.app;

/**
 * User: crane
 * Date: 13-3-28
 * Time: 下午5:25
 */
public class Sum implements Expression{
    Expression augend;
    Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount,to);
    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }


}
