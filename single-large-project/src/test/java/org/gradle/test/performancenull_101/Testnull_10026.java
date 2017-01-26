package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10026 {
    private final Productionnull_10026 production = new Productionnull_10026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}