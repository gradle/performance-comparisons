package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37249 {
    private final Productionnull_37249 production = new Productionnull_37249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}