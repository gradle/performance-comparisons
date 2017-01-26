package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37236 {
    private final Productionnull_37236 production = new Productionnull_37236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}