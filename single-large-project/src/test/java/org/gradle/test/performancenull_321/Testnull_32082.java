package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32082 {
    private final Productionnull_32082 production = new Productionnull_32082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}