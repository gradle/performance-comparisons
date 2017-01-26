package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2458 {
    private final Productionnull_2458 production = new Productionnull_2458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}