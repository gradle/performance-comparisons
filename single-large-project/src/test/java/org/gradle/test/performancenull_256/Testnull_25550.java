package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25550 {
    private final Productionnull_25550 production = new Productionnull_25550("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}