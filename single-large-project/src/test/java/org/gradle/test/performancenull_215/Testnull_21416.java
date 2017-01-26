package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21416 {
    private final Productionnull_21416 production = new Productionnull_21416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}