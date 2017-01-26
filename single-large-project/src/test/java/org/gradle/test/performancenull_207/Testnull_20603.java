package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20603 {
    private final Productionnull_20603 production = new Productionnull_20603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}