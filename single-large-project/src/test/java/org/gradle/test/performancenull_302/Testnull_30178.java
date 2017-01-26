package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30178 {
    private final Productionnull_30178 production = new Productionnull_30178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}