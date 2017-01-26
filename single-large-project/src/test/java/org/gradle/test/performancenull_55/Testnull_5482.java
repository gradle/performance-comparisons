package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5482 {
    private final Productionnull_5482 production = new Productionnull_5482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}