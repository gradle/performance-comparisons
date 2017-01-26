package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30193 {
    private final Productionnull_30193 production = new Productionnull_30193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}