package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30182 {
    private final Productionnull_30182 production = new Productionnull_30182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}