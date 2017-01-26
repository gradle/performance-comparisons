package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24938 {
    private final Productionnull_24938 production = new Productionnull_24938("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}