package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38428 {
    private final Productionnull_38428 production = new Productionnull_38428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}