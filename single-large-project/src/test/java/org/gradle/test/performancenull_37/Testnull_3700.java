package org.gradle.test.performancenull_37;

import static org.junit.Assert.*;

public class Testnull_3700 {
    private final Productionnull_3700 production = new Productionnull_3700("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}