package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23298 {
    private final Productionnull_23298 production = new Productionnull_23298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}