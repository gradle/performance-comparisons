package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17158 {
    private final Productionnull_17158 production = new Productionnull_17158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}