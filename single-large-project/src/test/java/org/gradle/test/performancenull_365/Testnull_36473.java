package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36473 {
    private final Productionnull_36473 production = new Productionnull_36473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}