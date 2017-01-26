package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30112 {
    private final Productionnull_30112 production = new Productionnull_30112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}