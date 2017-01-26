package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36766 {
    private final Productionnull_36766 production = new Productionnull_36766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}