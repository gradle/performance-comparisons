package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36419 {
    private final Productionnull_36419 production = new Productionnull_36419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}