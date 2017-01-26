package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36169 {
    private final Productionnull_36169 production = new Productionnull_36169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}