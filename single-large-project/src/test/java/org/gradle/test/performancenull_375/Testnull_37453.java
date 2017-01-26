package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37453 {
    private final Productionnull_37453 production = new Productionnull_37453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}