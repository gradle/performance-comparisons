package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22058 {
    private final Productionnull_22058 production = new Productionnull_22058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}