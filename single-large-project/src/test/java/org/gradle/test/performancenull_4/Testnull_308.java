package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_308 {
    private final Productionnull_308 production = new Productionnull_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}