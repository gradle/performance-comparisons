package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30169 {
    private final Productionnull_30169 production = new Productionnull_30169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}