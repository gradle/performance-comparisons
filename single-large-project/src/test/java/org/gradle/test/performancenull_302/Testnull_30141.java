package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30141 {
    private final Productionnull_30141 production = new Productionnull_30141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}