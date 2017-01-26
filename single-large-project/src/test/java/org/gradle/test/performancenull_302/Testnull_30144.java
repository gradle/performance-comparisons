package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30144 {
    private final Productionnull_30144 production = new Productionnull_30144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}