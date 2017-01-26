package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21208 {
    private final Productionnull_21208 production = new Productionnull_21208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}