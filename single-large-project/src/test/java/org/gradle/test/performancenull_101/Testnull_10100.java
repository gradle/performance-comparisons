package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10100 {
    private final Productionnull_10100 production = new Productionnull_10100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}