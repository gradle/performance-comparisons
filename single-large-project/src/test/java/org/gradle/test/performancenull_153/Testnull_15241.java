package org.gradle.test.performancenull_153;

import static org.junit.Assert.*;

public class Testnull_15241 {
    private final Productionnull_15241 production = new Productionnull_15241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}