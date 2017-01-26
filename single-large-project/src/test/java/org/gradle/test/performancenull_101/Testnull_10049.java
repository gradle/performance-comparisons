package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10049 {
    private final Productionnull_10049 production = new Productionnull_10049("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}