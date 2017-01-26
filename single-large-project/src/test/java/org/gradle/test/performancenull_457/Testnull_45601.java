package org.gradle.test.performancenull_457;

import static org.junit.Assert.*;

public class Testnull_45601 {
    private final Productionnull_45601 production = new Productionnull_45601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}