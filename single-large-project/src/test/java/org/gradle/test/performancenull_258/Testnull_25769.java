package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25769 {
    private final Productionnull_25769 production = new Productionnull_25769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}