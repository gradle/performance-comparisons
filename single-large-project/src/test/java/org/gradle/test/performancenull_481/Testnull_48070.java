package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48070 {
    private final Productionnull_48070 production = new Productionnull_48070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}