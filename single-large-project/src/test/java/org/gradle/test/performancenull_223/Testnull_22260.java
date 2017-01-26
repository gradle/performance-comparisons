package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22260 {
    private final Productionnull_22260 production = new Productionnull_22260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}