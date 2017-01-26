package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22065 {
    private final Productionnull_22065 production = new Productionnull_22065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}