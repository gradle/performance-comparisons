package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15347 {
    private final Productionnull_15347 production = new Productionnull_15347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}