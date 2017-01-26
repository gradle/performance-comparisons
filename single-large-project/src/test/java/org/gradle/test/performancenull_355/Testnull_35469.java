package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35469 {
    private final Productionnull_35469 production = new Productionnull_35469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}