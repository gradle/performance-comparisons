package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10069 {
    private final Productionnull_10069 production = new Productionnull_10069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}