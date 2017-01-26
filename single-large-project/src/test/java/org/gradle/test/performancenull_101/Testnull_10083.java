package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10083 {
    private final Productionnull_10083 production = new Productionnull_10083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}