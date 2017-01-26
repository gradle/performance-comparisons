package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25582 {
    private final Productionnull_25582 production = new Productionnull_25582("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}