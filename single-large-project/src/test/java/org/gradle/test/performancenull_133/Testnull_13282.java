package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13282 {
    private final Productionnull_13282 production = new Productionnull_13282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}