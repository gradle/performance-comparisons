package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24953 {
    private final Productionnull_24953 production = new Productionnull_24953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}