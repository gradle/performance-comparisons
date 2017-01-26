package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22298 {
    private final Productionnull_22298 production = new Productionnull_22298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}