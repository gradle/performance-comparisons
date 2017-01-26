package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42380 {
    private final Productionnull_42380 production = new Productionnull_42380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}