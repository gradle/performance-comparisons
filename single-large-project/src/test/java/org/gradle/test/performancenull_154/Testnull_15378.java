package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15378 {
    private final Productionnull_15378 production = new Productionnull_15378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}