package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2250 {
    private final Productionnull_2250 production = new Productionnull_2250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}