package org.gradle.test.performancenull_457;

import static org.junit.Assert.*;

public class Testnull_45683 {
    private final Productionnull_45683 production = new Productionnull_45683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}