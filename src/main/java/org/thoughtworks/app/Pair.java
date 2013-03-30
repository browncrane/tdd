package org.thoughtworks.app;

/**
 * User: crane
 * Date: 13-3-30
 * Time: 下午5:00
 */
class Pair {
    private String from;
    private String to;

    Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public boolean equals(Object object) {
        Pair pair = (Pair) object;
        return from.equals(pair.from) && to.equals(pair.to);
    }

    public int hashCode(){
        return 0;
    }
}
