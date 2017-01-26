package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30101 {
    private final Productionnull_30101 production = new Productionnull_30101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}