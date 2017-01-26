package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20497 {
    private final Productionnull_20497 production = new Productionnull_20497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}