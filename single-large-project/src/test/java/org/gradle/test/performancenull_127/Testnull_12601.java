package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12601 {
    private final Productionnull_12601 production = new Productionnull_12601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}