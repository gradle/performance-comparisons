package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5245 {
    private final Productionnull_5245 production = new Productionnull_5245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}