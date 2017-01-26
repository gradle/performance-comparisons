package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15345 {
    private final Productionnull_15345 production = new Productionnull_15345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}