package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20438 {
    private final Productionnull_20438 production = new Productionnull_20438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}