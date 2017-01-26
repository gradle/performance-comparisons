package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37231 {
    private final Productionnull_37231 production = new Productionnull_37231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}