package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37215 {
    private final Productionnull_37215 production = new Productionnull_37215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}