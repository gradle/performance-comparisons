package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22293 {
    private final Productionnull_22293 production = new Productionnull_22293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}