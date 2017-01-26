package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32983 {
    private final Productionnull_32983 production = new Productionnull_32983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}