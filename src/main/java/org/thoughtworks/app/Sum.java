package org.thoughtworks.app;

/**
 * User: crane
 * Date: 13-3-28
 * Time: 下午5:25
 */
public class Sum implements Expression{
    Money augend;
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount,to);
    }
}
