package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37276 {
    private final Productionnull_37276 production = new Productionnull_37276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}