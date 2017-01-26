package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25573 {
    private final Productionnull_25573 production = new Productionnull_25573("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}