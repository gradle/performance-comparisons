package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36478 {
    private final Productionnull_36478 production = new Productionnull_36478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}