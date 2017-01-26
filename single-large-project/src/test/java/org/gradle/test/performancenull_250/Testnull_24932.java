package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24932 {
    private final Productionnull_24932 production = new Productionnull_24932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}