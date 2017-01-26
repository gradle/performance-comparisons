package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10052 {
    private final Productionnull_10052 production = new Productionnull_10052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}