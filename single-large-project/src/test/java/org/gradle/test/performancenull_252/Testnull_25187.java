package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25187 {
    private final Productionnull_25187 production = new Productionnull_25187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}