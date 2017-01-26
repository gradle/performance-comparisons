package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23469 {
    private final Productionnull_23469 production = new Productionnull_23469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}