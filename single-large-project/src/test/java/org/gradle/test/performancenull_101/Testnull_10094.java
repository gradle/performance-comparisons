package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10094 {
    private final Productionnull_10094 production = new Productionnull_10094("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}