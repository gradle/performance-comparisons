package org.gradle.test.performancenull_499;

import static org.junit.Assert.*;

public class Testnull_49860 {
    private final Productionnull_49860 production = new Productionnull_49860("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}