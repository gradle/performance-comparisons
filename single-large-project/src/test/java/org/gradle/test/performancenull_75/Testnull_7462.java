package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7462 {
    private final Productionnull_7462 production = new Productionnull_7462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}