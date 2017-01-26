package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20593 {
    private final Productionnull_20593 production = new Productionnull_20593("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}