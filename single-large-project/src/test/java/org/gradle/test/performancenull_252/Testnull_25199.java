package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25199 {
    private final Productionnull_25199 production = new Productionnull_25199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}