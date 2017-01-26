package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37169 {
    private final Productionnull_37169 production = new Productionnull_37169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}