package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37270 {
    private final Productionnull_37270 production = new Productionnull_37270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}