package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42025 {
    private final Productionnull_42025 production = new Productionnull_42025("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}