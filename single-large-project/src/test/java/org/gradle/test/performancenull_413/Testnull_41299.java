package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41299 {
    private final Productionnull_41299 production = new Productionnull_41299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}