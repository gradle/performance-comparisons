package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20681 {
    private final Productionnull_20681 production = new Productionnull_20681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}