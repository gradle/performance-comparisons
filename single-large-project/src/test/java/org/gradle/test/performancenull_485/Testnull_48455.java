package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48455 {
    private final Productionnull_48455 production = new Productionnull_48455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}