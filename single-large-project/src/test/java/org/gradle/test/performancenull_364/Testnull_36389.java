package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36389 {
    private final Productionnull_36389 production = new Productionnull_36389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}