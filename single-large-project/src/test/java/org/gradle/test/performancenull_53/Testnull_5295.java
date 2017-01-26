package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5295 {
    private final Productionnull_5295 production = new Productionnull_5295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}