package org.gradle.test.performancenull_246;

import static org.junit.Assert.*;

public class Testnull_24600 {
    private final Productionnull_24600 production = new Productionnull_24600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}