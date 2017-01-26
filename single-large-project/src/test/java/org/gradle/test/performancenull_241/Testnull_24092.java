package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24092 {
    private final Productionnull_24092 production = new Productionnull_24092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}