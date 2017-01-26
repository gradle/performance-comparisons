package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36445 {
    private final Productionnull_36445 production = new Productionnull_36445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}