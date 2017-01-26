package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11928 {
    private final Productionnull_11928 production = new Productionnull_11928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}