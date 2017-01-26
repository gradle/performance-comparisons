package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41236 {
    private final Productionnull_41236 production = new Productionnull_41236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}