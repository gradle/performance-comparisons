package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17248 {
    private final Productionnull_17248 production = new Productionnull_17248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}