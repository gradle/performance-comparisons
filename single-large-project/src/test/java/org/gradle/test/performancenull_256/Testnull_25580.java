package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25580 {
    private final Productionnull_25580 production = new Productionnull_25580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}