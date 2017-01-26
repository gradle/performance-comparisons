package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37179 {
    private final Productionnull_37179 production = new Productionnull_37179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}