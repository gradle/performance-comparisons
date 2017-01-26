package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17462 {
    private final Productionnull_17462 production = new Productionnull_17462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}