package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6328 {
    private final Productionnull_6328 production = new Productionnull_6328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}