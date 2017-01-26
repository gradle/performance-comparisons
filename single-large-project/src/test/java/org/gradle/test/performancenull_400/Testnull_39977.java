package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39977 {
    private final Productionnull_39977 production = new Productionnull_39977("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}