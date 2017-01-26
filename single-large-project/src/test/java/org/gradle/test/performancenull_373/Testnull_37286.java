package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37286 {
    private final Productionnull_37286 production = new Productionnull_37286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}