package org.thoughtworks.app;

import java.util.Hashtable;

/**
 * User: crane
 * Date: 13-3-28
 * Time: 下午5:08
 */
public class Bank {
    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }

    int rate(String from, String to) {
        if(from.equals(to)) return 1;
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }

    private Hashtable rates = new Hashtable();
}
