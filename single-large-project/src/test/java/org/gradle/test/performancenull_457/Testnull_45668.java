package org.gradle.test.performancenull_457;

import static org.junit.Assert.*;

public class Testnull_45668 {
    private final Productionnull_45668 production = new Productionnull_45668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}