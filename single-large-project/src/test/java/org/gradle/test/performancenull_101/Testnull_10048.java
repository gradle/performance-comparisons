package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10048 {
    private final Productionnull_10048 production = new Productionnull_10048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}