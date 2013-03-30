package org.thoughtworks.app;

/**
 * User: crane
 * Date: 13-3-28
 * Time: 下午5:08
 */
public class Bank {
    public Money reduce(Expression source, String to){
        return source.reduce(to);
    }
}
