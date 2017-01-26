package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22069 {
    private final Productionnull_22069 production = new Productionnull_22069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}