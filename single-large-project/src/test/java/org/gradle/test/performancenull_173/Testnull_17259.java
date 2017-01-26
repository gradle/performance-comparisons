package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17259 {
    private final Productionnull_17259 production = new Productionnull_17259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}