package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14932 {
    private final Productionnull_14932 production = new Productionnull_14932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}