package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24907 {
    private final Productionnull_24907 production = new Productionnull_24907("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}