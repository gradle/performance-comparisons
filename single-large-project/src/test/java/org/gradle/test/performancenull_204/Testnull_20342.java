package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20342 {
    private final Productionnull_20342 production = new Productionnull_20342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}