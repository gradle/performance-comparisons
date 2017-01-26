package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42297 {
    private final Productionnull_42297 production = new Productionnull_42297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}