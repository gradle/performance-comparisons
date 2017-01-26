package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2452 {
    private final Productionnull_2452 production = new Productionnull_2452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}