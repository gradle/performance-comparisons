package org.gradle.test.performancenull_246;

import static org.junit.Assert.*;

public class Testnull_24598 {
    private final Productionnull_24598 production = new Productionnull_24598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}