package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48441 {
    private final Productionnull_48441 production = new Productionnull_48441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}