package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10043 {
    private final Productionnull_10043 production = new Productionnull_10043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}