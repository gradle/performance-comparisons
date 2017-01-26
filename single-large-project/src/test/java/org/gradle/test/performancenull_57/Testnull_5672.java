package org.gradle.test.performancenull_57;

import static org.junit.Assert.*;

public class Testnull_5672 {
    private final Productionnull_5672 production = new Productionnull_5672("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}