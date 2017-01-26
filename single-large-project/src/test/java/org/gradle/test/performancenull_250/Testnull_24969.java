package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24969 {
    private final Productionnull_24969 production = new Productionnull_24969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}