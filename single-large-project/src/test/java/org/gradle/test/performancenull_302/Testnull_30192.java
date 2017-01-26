package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30192 {
    private final Productionnull_30192 production = new Productionnull_30192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}