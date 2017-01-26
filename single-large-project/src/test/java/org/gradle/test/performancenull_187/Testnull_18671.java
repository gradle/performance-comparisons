package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18671 {
    private final Productionnull_18671 production = new Productionnull_18671("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}